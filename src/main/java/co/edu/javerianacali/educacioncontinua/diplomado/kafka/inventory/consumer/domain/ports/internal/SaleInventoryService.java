package co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.ports.internal;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.models.Sale;

public interface SaleInventoryService {
  public Sale addSale(Sale sale);
}
