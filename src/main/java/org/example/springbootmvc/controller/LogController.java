package org.example.springbootmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/greeting")
    public String greeting() {
        logger.info("GET request received for /greeting");
        logger.debug("Returning the 'greeting' view from LogController");
        return "greeting";
    }
}
