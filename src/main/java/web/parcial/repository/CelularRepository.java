package web.parcial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.parcial.entity.Celular;

@Repository
public interface CelularRepository extends CrudRepository<Celular, Long>{

}
