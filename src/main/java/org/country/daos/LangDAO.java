package org.country.daos;

import org.country.model.Lang;

import java.util.List;

public interface LangDAO {
    List<Lang> all(String c);
    List<Lang> country(String lang);
}
