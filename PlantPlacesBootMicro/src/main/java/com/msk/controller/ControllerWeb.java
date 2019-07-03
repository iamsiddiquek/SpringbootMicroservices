package com.msk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerWeb {

	@GetMapping("/start")
	public String start() {
		return "start";
	}
	
	// this is older way of creating mapping of get older than 4.3 spring
//	@RequestMapping(value = "/start", method = RequestMethod.GET)
//	public String read() {
//		return "start";
//	}
	
	// this will only called when we are defining content type json in the url 
//	@GetMapping(value="/start", headers = {"content-type=text/json "})
//	public String readJson() {
//		return "start";
//	}

	// this mehtod will be called when "?loyality=blue" parameter is added to the url
	@GetMapping(value="/start", params = {"loyality=blue"})
	public String readBlue() {
		return "start";
	}

	// this will be called when the website is lodded.
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
}
