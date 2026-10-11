package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class InfoController {

    @GetMapping("/info")
    public String info(){
        return "products-api: a Spring Boot REST API built for 5COSC019W Object Oriented Programming.";
    }

}
