package com.xsis.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HomeController {

	@RequestMapping("/") 
	public String home() {
		return "home";
	}
}