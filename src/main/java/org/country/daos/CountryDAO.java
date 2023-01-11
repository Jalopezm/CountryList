package org.country.daos;

import org.country.model.Country;

import java.util.List;

public interface CountryDAO {
    void save(Country c);
    List<Country> all();
}
