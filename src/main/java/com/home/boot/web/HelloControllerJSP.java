package com.home.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerJSP {

    @RequestMapping(value = "/home", method=RequestMethod.GET)
	public String home() {
	    return "home/home.jsp";
	}
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	public ModelAndView greet(@RequestParam(value = "name", required=false, defaultValue="Hello")final String name, final Model model) {
		return new ModelAndView("home/greeting.jsp", "name", name);
	}

	@RequestMapping(value = "/hello/{name}", method=RequestMethod.GET)
	public ModelAndView greetTwoWays(@PathVariable(value="name") final String name, final Model model) {
		return new ModelAndView("home/greeting.jsp", "name", name);
	}
}
