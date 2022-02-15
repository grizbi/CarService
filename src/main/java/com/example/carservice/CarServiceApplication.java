package com.example.carservice;
import com.example.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarServiceApplication {

    @Autowired
    CarRepository carRepository;


    public static void main(String[] args) {
        SpringApplication.run(CarServiceApplication.class, args);
    }



}
