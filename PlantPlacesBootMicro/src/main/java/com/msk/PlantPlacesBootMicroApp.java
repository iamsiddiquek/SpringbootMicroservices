package com.msk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PlantPlacesBootMicroApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PlantPlacesBootMicroApp.class, args);
		System.out.println("Hello world from PPMA. . . ");
		
		int i = 0;
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name+" -> "+i++);
		}
		
		
	}

	
}
