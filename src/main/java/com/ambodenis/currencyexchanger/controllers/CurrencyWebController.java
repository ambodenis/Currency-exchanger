package com.ambodenis.currencyexchanger.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrencyWebController {
	
	 @GetMapping("/")
	    public String serveWebPage() {
	        return "index";
	    }

}
