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
		mv.addObject("greeting", "Welcome to Spring");
		return mv;
	}
 
 
 
 
 
 
}
