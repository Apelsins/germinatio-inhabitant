package vela.gliese1132b.germinatio.inhabitant_web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vela.gliese1132b.germinatio.inhabitant_impl.service.InhabitantService;
import vela.gliese1132b.germinatio.inhabitant_web.mapper.InhabitantMapper;
import vela.gliese1132b.germinatio.inhabitant_web_common.dto.InhabitantDTO;

import java.util.List;

@RestController
@RequestMapping("/inhabitant")
@AllArgsConstructor
public class InhabitantController {

    private final InhabitantService inhabitantService;

    private final InhabitantMapper inhabitantMapper;

    @GetMapping
    public List<InhabitantDTO> getAllInhabitants() {
        return inhabitantMapper.toListDTO(
                inhabitantService.getAllInhabitants()
        );
    }

}
