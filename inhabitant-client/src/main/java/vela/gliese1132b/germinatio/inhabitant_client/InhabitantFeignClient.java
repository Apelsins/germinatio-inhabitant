package vela.gliese1132b.germinatio.inhabitant_client;

import org.springframework.cloud.netflix.feign.FeignClient;
import vela.gliese1132b.germinatio.inhabitant_web_common.InhabitantFacade;

@FeignClient(value = "inhabitant-client", url = "service.inhabitant.url")
public interface InhabitantFeignClient extends InhabitantFacade {
}
