package com.example.employee_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
//@EnableScheduling
public class EmployeeCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudApplication.class, args);
	}

//	@Scheduled(fixedRate = 60000) // Runs every 60 seconds
//	public void keepAlive() {
//		System.out.println("Application is running...");
//	}
}
