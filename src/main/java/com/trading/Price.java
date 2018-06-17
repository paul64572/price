package com.trading;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Price {

    public static void main( String... args )
    {
        System.out.println("Hello world");
        SpringApplication.run(Price.class, args);
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello there";
    }

}
