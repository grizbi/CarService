package com.example.carservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class CarServiceApplication {

    

    public static void main(String[] args) {
        SpringApplication.run(CarServiceApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void createAdminAndCars() {

    }

}
