package org.country.controller;

import org.country.model.Country;
import org.country.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    MyService service;

    @GetMapping("/all")
    public String allCountry(Model model){
        List<Country> country = service.allCountry();
        model.addAttribute("country",country);
        return "allCountry";
    }
}
