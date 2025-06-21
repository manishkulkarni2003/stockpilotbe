package com.stockpilot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockpilotbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockpilotbackendApplication.class, args);
		System.out.println("Database Connected");
	}

}
