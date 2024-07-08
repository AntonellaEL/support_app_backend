package dev.anto.supportApp.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(path = "")
    
    public String index() {
        return "Hello Spring Boot";
    }
}
