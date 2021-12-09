package com.sestak.jessica.springdemofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringDemoFinalApplication {

    @GetMapping("/message")
    public String message() {
        return "Congrats! Your app deployed successfully";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoFinalApplication.class, args);
    }

}
