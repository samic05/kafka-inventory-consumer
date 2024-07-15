package co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.infraestructure.repositories;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.infraestructure.repositories.entities.RestaurantSaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRestaurantRegistry extends JpaRepository<RestaurantSaleEntity, Integer> {}
