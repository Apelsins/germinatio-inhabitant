package vela.gliese1132b.germinatio.inhabitant.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import vela.gliese1132b.germinatio.inhabitant.domain.Inhabitant;
import vela.gliese1132b.germinatio.inhabitant.dto.InhabitantDTO;

import java.util.List;

@Component
@AllArgsConstructor
public class InhabitantMapper {

    public Inhabitant toEntity(final InhabitantDTO dto) {
        return new Inhabitant(dto.getId(), dto.getName());
    }

    public List<Inhabitant> toListEntity(final List<InhabitantDTO> dtos) {
        return dtos.stream().map(this::toEntity).toList();
    }

    public InhabitantDTO toDTO(final Inhabitant entity) {
        return new InhabitantDTO(
                entity.getId(),
                entity.getName()
        );
    }

    public List<InhabitantDTO> toListDTO(final List<Inhabitant> entities) {
        return entities.stream().map(this::toDTO).toList();
    }
}
