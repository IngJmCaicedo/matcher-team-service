package ingjmcaicedo.matcher.team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TeamServiceConfig {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TeamServiceConfig.class, args);
	}
	
}
