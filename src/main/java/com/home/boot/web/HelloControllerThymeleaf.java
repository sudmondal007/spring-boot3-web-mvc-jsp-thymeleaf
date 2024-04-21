package com.home.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControllerThymeleaf {

	@GetMapping("/hellothymeleaf")
	public String helloWorld(Model model) {
		System.out.println("hello..............");
		model.addAttribute("message", "Hello Thymeleaf!");
		model.addAttribute("mytext", "Sample text for another message");
		return "helloworld.html";
	}
}
