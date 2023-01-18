package com.example.email_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailAppApplication.class, args);

        Email em1 = new Email("John", "Mbadi");
        System.out.println(em1.toString());


    }

}
