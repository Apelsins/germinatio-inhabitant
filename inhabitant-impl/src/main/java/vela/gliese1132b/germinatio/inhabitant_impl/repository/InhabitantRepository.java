package vela.gliese1132b.germinatio.inhabitant_impl.repository;


import org.springframework.data.repository.CrudRepository;
import vela.gliese1132b.germinatio.inhabitant_impl.entity.Inhabitant;

import java.util.UUID;

public interface InhabitantRepository extends CrudRepository<Inhabitant, Long> {

}
