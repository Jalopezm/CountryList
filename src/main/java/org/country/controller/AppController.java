package org.country.controller;

import org.country.model.Cities;
import org.country.model.Country;
import org.country.model.Lang;
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
    @GetMapping("/cities/countryCode={countryCode}")
    public String countryCities(Model model,@PathVariable String countryCode){
        List<Cities> cities = service.countryCities(countryCode);
        model.addAttribute("cities",cities);
        return "cities";
    }
    @GetMapping("/language/countryCode={countryCode}")
    public String countryLanguages(Model model,@PathVariable String countryCode){
        List<Lang> languages = service.countryLanguages(countryCode);
        model.addAttribute("languages",languages);
        return "languages";
    }
    @GetMapping("/language/language={lang}")
    public String Languages(Model model,@PathVariable String lang){
        List<Country> languagesC = service.languagesInCountry(lang);
        model.addAttribute("languagesC",languagesC);
        System.out.println(languagesC);
        return "languages";
    }

    @GetMapping("/addCities")
    public String addCity(Model model) {
        model.addAttribute("countries", service.allCountry());
        return "addCity";
    }
    @ResponseBody
    @GetMapping("/successCityAdd")
    public String successCityAdd(@RequestParam String name, @RequestParam String countryCode, @RequestParam String district, @RequestParam int population) {
        Cities city = new Cities();
        city.setName(name);
        city.setCountryCode(countryCode);
        city.setDistrict(district);
        city.setPopulation(population);
        return "Ciudad añadida con exito";
    }
}
