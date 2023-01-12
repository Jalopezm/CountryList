package org.country.services;

import org.country.daos.CitiesDAO;
import org.country.daos.CountryDAO;
import org.country.daos.LangDAO;
import org.country.model.Cities;
import org.country.model.Country;
import org.country.model.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    CountryDAO countryDAO;
    @Autowired
    CitiesDAO citiesDAO;
    @Autowired
    LangDAO langDAO;


    public void newCountry(String name) {
        Country c = new Country();
    }

    public List<Country> allCountry() {
        return countryDAO.all();
    }

    public List<Cities> countryCities(String c) {
        return citiesDAO.all(c);
    }

    public List<Lang> countryLanguages(String c) {
        return langDAO.all(c);
    }
    public List<Lang> LanguagesInCountry(String lang) {
        return langDAO.country(lang);
    }
}
