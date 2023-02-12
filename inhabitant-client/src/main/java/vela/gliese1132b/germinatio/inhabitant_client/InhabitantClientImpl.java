package vela.gliese1132b.germinatio.inhabitant_client;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import vela.gliese1132b.germinatio.inhabitant_web_common.dto.InhabitantDTO;

import java.util.List;

@Component
@AllArgsConstructor
public class InhabitantClientImpl implements InhabitantClient {

    private final InhabitantFeignClient client;

    @Override
    public List<InhabitantDTO> getAllInhabitants() {
        try {
            return client.getAllInhabitants();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
}
