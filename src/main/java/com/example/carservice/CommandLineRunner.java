package com.example.carservice;

import com.example.carservice.entity.Car;
import com.example.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

    CarRepository carRepository;

    @Autowired
    CommandLineRunner(CarRepository carRepository)
    {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car("BMW X3", 2000, 370000, 2000, "USA");
        carRepository.save(car1);

    }
}
