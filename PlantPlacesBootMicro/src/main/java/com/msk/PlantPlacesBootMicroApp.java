package com.msk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.msk.dataImpl.PersonImpl;


@SpringBootApplication
public class PlantPlacesBootMicroApp implements CommandLineRunner{

	@Autowired
	PersonImpl personImpl;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PlantPlacesBootMicroApp.class, args);
		System.out.println("Hello world from PPMA. . . ");
		
		// this loop will show you all the classes which SpringBoot Autoconfigures/Binds/weilds to classes and configuration files.
//		int i = 0;
//		for (String name : applicationContext.getBeanDefinitionNames()) {
//			System.out.println(name+" -> "+i++);
//		}
	}

	// this will when application context launched. . . 
	@Override
	public void run(String... args) throws Exception {
		logger.info(" Person Info -> {}" ,personImpl.findAll());
		
	}

	
}
