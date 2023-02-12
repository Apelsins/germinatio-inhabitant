package vela.gliese1132b.germinatio.inhabitant_client;

import vela.gliese1132b.germinatio.inhabitant_web_common.dto.InhabitantDTO;

import java.util.List;

public interface InhabitantClient {

    List<InhabitantDTO> getAllInhabitants();

}
