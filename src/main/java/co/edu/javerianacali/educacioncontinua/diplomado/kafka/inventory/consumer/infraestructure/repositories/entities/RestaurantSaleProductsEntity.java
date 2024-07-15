package co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.infraestructure.repositories.entities;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.models.SaleProduct;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "restaurant_sale_products")
public class RestaurantSaleProductsEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID productId;

  private String productName;
  private int quantity;
  private double unitaryPrice;

  public static RestaurantSaleProductsEntity fromDomainModel(SaleProduct saleProduct) {
    return new RestaurantSaleProductsEntity(
        saleProduct.getProductId(),
        saleProduct.getProductName(),
        saleProduct.getQuantity(),
        saleProduct.getUnitaryPrice());
  }

  public SaleProduct toDomainModel() {
    return new SaleProduct(productId, productName, quantity, unitaryPrice);
  }
}
