package co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.infraestructure.kafka.consumer;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.ports.internal.SaleInventoryService;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.infraestructure.kafka.events.SaleEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaSaleEventConsumer {

  public final SaleInventoryService restaurantSalesInventoryService;

  @KafkaListener(
      topics = "event-driven-architecture",
      groupId = "restaurant_inventory",
      containerFactory = "listenerContainerFactory")
  public void consume(SaleEvent event) {
    restaurantSalesInventoryService.addSale(event.toDomainModel());
  }
}
