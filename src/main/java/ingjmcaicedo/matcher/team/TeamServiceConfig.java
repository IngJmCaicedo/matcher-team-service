package ingjmcaicedo.matcher.team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableMongoRepositories
public class TeamServiceConfig {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TeamServiceConfig.class, args);
	}
	
}
