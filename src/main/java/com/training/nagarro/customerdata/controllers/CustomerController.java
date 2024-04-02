package com.training.nagarro.customerdata.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	
	 @GetMapping("/home")
	 public String getString() {
		return "String for home page is published";
	}
}
