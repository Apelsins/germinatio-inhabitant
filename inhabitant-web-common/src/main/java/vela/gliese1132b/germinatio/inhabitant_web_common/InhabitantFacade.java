package vela.gliese1132b.germinatio.inhabitant_web_common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vela.gliese1132b.germinatio.inhabitant_web_common.dto.InhabitantDTO;

import java.util.List;

@RequestMapping("/inhabitant")
public interface InhabitantFacade {

    @GetMapping("/all")
    List<InhabitantDTO> getAllInhabitants();

}
