package com.msk.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		
		// this will act as a view controller whenever we are passing "/index" this will let us send to index.html page
		registry.addViewController("/index").setViewName("index");
	}
}