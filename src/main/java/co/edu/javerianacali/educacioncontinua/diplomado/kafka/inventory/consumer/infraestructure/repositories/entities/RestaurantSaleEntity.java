package co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.infraestructure.repositories.entities;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.models.Sale;
import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "restaurant_sales")
public class RestaurantSaleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "restaurant_sales_id")
  private List<RestaurantSaleProductsEntity> products;

  private String shopperName;
  private String shopperEmail;
  private double discount;

  public static RestaurantSaleEntity fromDomainModel(Sale sale) {
    return new RestaurantSaleEntity(
        sale.getId(),
        sale.getProducts().stream().map(RestaurantSaleProductsEntity::fromDomainModel).toList(),
        sale.getShopperName(),
        sale.getShopperEmail(),
        sale.getDiscount());
  }

  public Sale toDomainModel() {
    return new Sale(
        id,
        products.stream().map(RestaurantSaleProductsEntity::toDomainModel).toList(),
        shopperName,
        shopperEmail,
        discount);
  }
}
