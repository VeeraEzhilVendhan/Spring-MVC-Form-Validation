package com.spring.mvc.validation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	//add an initbinder.... to convert trim input strings
	//remove leading trailing whitespace
	//resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder databinder)
	{
		StringTrimmerEditor st= new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, st);
	}
	
	@RequestMapping("/")
	public String showform(Model model)
	{
		model.addAttribute("customer", new Customer());
		
	    return "customer-form";
	}
	
	@RequestMapping("/processform")
	public String processform(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingresult)
	{
		// to show error msg
		System.out.println("error msg "+ bindingresult);
		
		if(bindingresult.hasErrors())
		{
			return "customer-form";
		}
		else
		{
			return "customer-confirmation";
		}
		
	}

}
