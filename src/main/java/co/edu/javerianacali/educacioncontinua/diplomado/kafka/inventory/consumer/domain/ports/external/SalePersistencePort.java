package co.edu.javerianacali.educacioncontinua.diplomado.kafka.inventory.consumer.domain.ports.external;

public interface SalePersistencePort<T> {

  public T save(T entity);
}
