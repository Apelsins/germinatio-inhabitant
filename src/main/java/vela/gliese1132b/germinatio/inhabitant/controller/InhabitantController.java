package vela.gliese1132b.germinatio.inhabitant.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vela.gliese1132b.germinatio.inhabitant.dto.InhabitantDTO;

import java.util.List;

@RestController
@RequestMapping("/inhabitant")
@AllArgsConstructor
public class InhabitantController {


    @GetMapping
    public List<InhabitantDTO> getAllInhabitants() {
        return null;
    }

    @GetMapping("/hi")
    String all() {
        return "Hi";
    }
}
