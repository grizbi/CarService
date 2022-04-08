package com.example.carservice.service;

import com.example.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {

    CarRepository carRepository;

    @Autowired
    CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }
}
