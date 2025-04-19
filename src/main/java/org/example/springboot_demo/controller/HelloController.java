package org.example.springboot_demo.controller;

import org.example.springboot_demo.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    /*
	 UC1 -> Create a Rest Controller to demonstrate
	the various HTTP Methods and respond
	hello messages to the User. To begin
	with show Hello from BridgeLabz
	- Use GET Request Method
	- Use CURL to demonstrate the REST API Call
	- curl localhost:8080/hello -w "\n"*/

    // GET: http://localhost:8080/hello or / or /home


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
