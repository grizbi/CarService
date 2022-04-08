package com.example.carservice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Configuration {

    @GetMapping("/cars")
    public String getCars(Model model){

        model.addAttribute("cars", )

        return "cars.html";


    }

}
