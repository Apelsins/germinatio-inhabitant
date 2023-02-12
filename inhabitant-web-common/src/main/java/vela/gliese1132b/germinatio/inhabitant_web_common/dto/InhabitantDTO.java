package vela.gliese1132b.germinatio.inhabitant_web_common.dto;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class InhabitantDTO {

    @Nullable
    private Long id;

    @Nonnull
    private String name;
}
