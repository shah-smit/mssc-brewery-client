package udemy.course.msscbreweryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsscBreweryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBreweryClientApplication.class, args);
	}

}
