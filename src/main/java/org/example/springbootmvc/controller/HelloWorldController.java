package org.example.springbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

        @GetMapping("/hello")
        public String sayHello(Model model) {
            model.addAttribute("hello", "Hello from BridgeLabz");
            return "hello";
        }
    }


