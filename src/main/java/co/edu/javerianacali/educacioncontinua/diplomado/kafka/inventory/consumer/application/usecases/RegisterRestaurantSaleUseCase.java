package co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.application.usecases;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.models.Sale;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.ports.external.SalePersistencePort;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.ports.internal.RegisterSaleUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RegisterRestaurantSaleUseCase implements RegisterSaleUseCase {

  private final SalePersistencePort<Sale> PostgresSalePersistenceAdapter;

  @Override
  public Sale registerSale(Sale sale) {
    return PostgresSalePersistenceAdapter.save(sale);
  }
}
