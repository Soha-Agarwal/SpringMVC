package com.citi.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	 @RequestMapping("/")
	    String home(ModelMap modal) {
	        modal.addAttribute("title", "First Spring Proj");
	        modal.addAttribute("message", "Welcome to SpringBoot");
	        return "hello";
	    }
}
