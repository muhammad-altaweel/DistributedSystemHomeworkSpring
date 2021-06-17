package distributed.system.homework.decorate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DecorateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecorateApplication.class, args);
	}

}
