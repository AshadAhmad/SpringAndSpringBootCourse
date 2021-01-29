package com.ashadahmad.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@RequestMapping("/showForm")
	public String showCustomerForm(Model model) {
		model.addAttribute("customerModel",new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processCustomerForm(@Valid @ModelAttribute("customerModel") Customer customer, BindingResult bindingResult) {
		System.out.println(customer);
		System.out.println(bindingResult.hasErrors());
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}else{
			return "customer-confirmation";
		}
	}
}
