package co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.infraestructure.repositories;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.models.Sale;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.ports.external.SalePersistencePort;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.infraestructure.repositories.entities.RestaurantSaleEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostgresSalePersistenceAdapter implements SalePersistencePort<Sale> {

  private final JpaRepository<RestaurantSaleEntity, Integer> jpaRestaurantRegistry;

  @Override
  public Sale save(Sale entity) {
    RestaurantSaleEntity result =
        jpaRestaurantRegistry.save(RestaurantSaleEntity.fromDomainModel(entity));
    return result.toDomainModel();
  }
}
