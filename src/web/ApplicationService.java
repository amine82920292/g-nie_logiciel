package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import config.config;

@SpringBootApplication
@Import({config.class})public class ApplicationService {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationService.class, args);
		
	}	
}
