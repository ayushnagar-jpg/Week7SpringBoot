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


    /*UC2 - >Make REST Call to show Hello
   Mark from BridgeLabz
   - Use GET Request Method and pass name as
   query parameter
   - Use CURL to demonstrate the REST API Call
   - curl localhost:8080/hello/query?name=Mark
   -w "\n"*/
    // GET method with query parameter
    @GetMapping("/hello/query")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }



    /*UC3 -> Make REST Call to show Hello
        Mark from BridgeLabz
        - Use GET Request Method and pass name as
        path variable
        - Use CURL to demonstrate the REST API Call
        - curl localhost:8080/hello/param/Mark -w
         "\n"*/
    // GET method using path variable
    @GetMapping("/hello/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

}
