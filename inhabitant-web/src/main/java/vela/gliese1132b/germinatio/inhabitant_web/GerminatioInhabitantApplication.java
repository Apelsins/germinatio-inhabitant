package vela.gliese1132b.germinatio.inhabitant_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication(
		scanBasePackages = {
				"vela.gliese1132b.germinatio.inhabitant_impl"
		}
)
@EnableJdbcRepositories(
		basePackages = {
				"vela.gliese1132b.germinatio.inhabitant_impl.repository"
		}
)
public class GerminatioInhabitantApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerminatioInhabitantApplication.class, args);
	}

}
