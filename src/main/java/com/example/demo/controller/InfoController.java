//Create a controller class with the name InfoController.java in the package com.example.demo.controller add a GetMapping() method to return  a "info.html" file as a response.

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {
    @GetMapping("/info")
    public String info(){
        return "info";
    }
}