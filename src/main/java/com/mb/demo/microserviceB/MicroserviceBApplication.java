package com.mb.demo.microserviceB;

import com.mb.demo.microserviceB.model.*;
import com.mb.demo.microserviceB.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class MicroserviceBApplication {


	private YourConsumerService yourConsumerService;

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBApplication.class, args);
		//change for third commit
		//change for third commit 2
		//www
//wwse
		//eeee
		//new for B
	}
	@Bean
	public CommandLineRunner run(YourConsumerService consumerService) {
		return args -> {
			// Creating a sample student
			// Calling the createStudent method to consume the API
			Student a= consumerService.createStudent(new Student(1L,"Ssss",89));
			System.out.println(a.getAge());
		};
	}

}
