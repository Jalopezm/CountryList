package org.country.services;

import org.country.daos.CountryDAO;
import org.country.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    CountryDAO countryDAO;

    public void newCountry(String name) {
        Country c = new Country();
    }

    public List<Country> allCountry() {
        return countryDAO.all();
    }
}
