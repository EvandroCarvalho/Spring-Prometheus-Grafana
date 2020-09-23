package com.example.metrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringMetricsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMetricsApplication.class, args);
	}

}
