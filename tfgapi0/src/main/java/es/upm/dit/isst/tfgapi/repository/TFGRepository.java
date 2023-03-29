package es.upm.dit.isst.tfgapi.repository;

import es.upm.dit.isst.tfgapi.model.TFG;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface TFGRepository extends CrudRepository<TFG, String> {

    List<TFG> findByTutor(String tutor);

}
