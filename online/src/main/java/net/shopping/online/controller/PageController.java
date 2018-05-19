package net.shopping.online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
//INFO 1	: For test purpose to check if  @RequestParam and @PathVariable are working in project module --> Verified.
/* @RequestMapping(value = "/test")
 public ModelAndView test(@RequestParam(value = "greeting",required = false)String greeting) {
	 
	 if(greeting == null) {
		 greeting = "Hello there!";
	 }
	 System.out.println("greeting "  +greeting);
	 ModelAndView mv = new ModelAndView("page");
	 mv.addObject("greeting",greeting);
	 return mv;
 }
 @RequestMapping(value = "/test/{greeting}")
 public ModelAndView test(@PathVariable("greeting")String greeting) {
	 
	 if(greeting == null) {
		 greeting = "Hello there!";
	 }
	 System.out.println("greeting "  +greeting);
	 ModelAndView mv = new ModelAndView("page");
	 mv.addObject("greeting",greeting);
	 return mv;
 } */
 
//TODO: Project work will started from here all the logics and project comments will be written here. 
	
	@RequestMapping(value = {"/" , "/home" , "/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;
	}
 
	@RequestMapping(value = "/about")
	public ModelAndView aboutCompany() {
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
 
	@RequestMapping(value = "/listProducts")
	public ModelAndView listOfProducts() {
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring");
		mv.addObject("title", "All Products");
		mv.addObject("userClickProducts", true);
		return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contactOfCompany() {
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
 
 
 
}
