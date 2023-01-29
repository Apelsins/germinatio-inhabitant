package vela.gliese1132b.germinatio.inhabitant.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vela.gliese1132b.germinatio.inhabitant.domain.Inhabitant;

import java.util.UUID;

public interface InhabitantRepository extends JpaRepository<Inhabitant, UUID> {
}
