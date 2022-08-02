package dio.desafiodio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioDioPadroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDioPadroesApplication.class, args);
	}

}
