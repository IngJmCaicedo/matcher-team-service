package ingjmcaicedo.matcher.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdminServiceConfig {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AdminServiceConfig.class, args);
	}
	
}
