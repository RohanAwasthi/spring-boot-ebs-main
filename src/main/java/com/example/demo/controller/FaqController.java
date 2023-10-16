//Create a controller class with the name FaqController.java in the package com.example.demo.controller add a GetMapping() method to return  a "faq.html" file as a response.

//Create a controller class with the name FaqController.java in the package com.example.demo.controller add a GetMapping() method to return  a "faq.html" file as a response.
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FaqController {
	@GetMapping("/faq")
	public String faq() {
		return "faq";
	}

    //Create another method to return a "home.html" file as a response.
    @GetMapping("/home")
    public String home() {
        return "home";
    }




}




 

