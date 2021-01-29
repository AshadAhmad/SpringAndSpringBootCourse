package com.ashadahmad.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from the html form
		String name = request.getParameter("studentName");
		
		//convert all the data to upper case
		name = name.toUpperCase();
		
		
		//create message yo! dude
		String result = "YO! " + name;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	//Using @RequestParams instead of request.get()
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {
		
		//read the request parameter from the html form
		//		String name = request.getParameter("studentName"); //Now since we used @RequestParam("studentName") request.get is useless.
		
		//convert all the data to upper case
		name = name.toUpperCase();
		
		
		//create message yo! dude
		String result = "Hi this is a greeting from processFormVersionThree and we are getting your name using the @RequestParam ! " + name;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
