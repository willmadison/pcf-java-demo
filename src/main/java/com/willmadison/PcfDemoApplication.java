package com.willmadison;

import com.willmadison.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {GreetingController.class})
public class PcfDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcfDemoApplication.class, args);
	}
}
