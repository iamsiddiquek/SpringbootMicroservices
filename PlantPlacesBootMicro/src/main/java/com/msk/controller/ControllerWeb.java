package com.msk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerWeb {

	@GetMapping("/start")
	public String start() {
		return "start";
	}
	
	@GetMapping("/")
	public String index() {
		return "/";
	}
	
}
