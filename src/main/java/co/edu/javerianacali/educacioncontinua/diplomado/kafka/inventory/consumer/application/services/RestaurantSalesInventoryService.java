package co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.application.services;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.models.Sale;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.ports.internal.RegisterSaleUseCase;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.ports.internal.SaleInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantSalesInventoryService implements SaleInventoryService {

  public final RegisterSaleUseCase registerRestaurantSale;

  @Override
  public Sale addSale(Sale sale) {
    return registerRestaurantSale.registerSale(sale);
  }
}
