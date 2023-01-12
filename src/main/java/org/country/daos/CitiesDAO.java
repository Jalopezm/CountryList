package org.country.daos;

import org.country.model.Cities;

import java.util.List;

public interface CitiesDAO {
    List<Cities> all(String code);
}
