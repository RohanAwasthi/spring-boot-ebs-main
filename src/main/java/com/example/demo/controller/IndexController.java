package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  @GetMapping("/")
  public String index() {
    return "index"; // Return the name of the view to use (in this case, "index.html")
  }

}
