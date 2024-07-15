package co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.models;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaleProduct {
  private UUID productId;
  private String productName;
  private int quantity;
  private double unitaryPrice;
}
