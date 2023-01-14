package org.country.daos;

import org.country.model.Country;
import org.country.model.Lang;

import java.util.List;

public interface LangDAO {
    List<Lang> all(String c);
    List<Country> country(String lang);
}
