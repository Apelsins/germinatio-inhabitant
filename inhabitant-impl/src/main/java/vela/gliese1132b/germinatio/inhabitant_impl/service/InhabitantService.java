package vela.gliese1132b.germinatio.inhabitant_impl.service;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vela.gliese1132b.germinatio.inhabitant_impl.entity.Inhabitant;
import vela.gliese1132b.germinatio.inhabitant_impl.repository.InhabitantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InhabitantService {

    private final InhabitantRepository inhabitantRepository;

    public List<Inhabitant> getAllInhabitants() {
        return Lists.newArrayList(inhabitantRepository.findAll());
    }
}
