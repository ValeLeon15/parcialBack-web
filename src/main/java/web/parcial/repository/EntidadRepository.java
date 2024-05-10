package web.parcial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.parcial.entity.Entidad;

@Repository
public interface EntidadRepository extends CrudRepository<Entidad, Long>{

}
