package org.country.daos;

import org.country.model.Cities;
import org.country.model.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LangDAOImpl implements LangDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;
    private final RowMapper<Lang> langRowMapper = (rs, rn) ->{
        Lang lang = new Lang();
        lang.setName(rs.getString("Language"));
        lang.setOff(rs.getString("IsOfficial"));
        return lang;
    };
    @Override
    public List<Lang> all(String c) {
        return jdbcTemplate.query("select Language,IsOfficial from countrylanguage Where CountryCode Like ?", langRowMapper, c);
    }

    @Override
    public List<Lang> country(String lang) {
        return jdbcTemplate.query("SELECT Name FROM `country` WHERE CountryCode in (SELECT CountryCode FROM countrylanguage where Language = ?)", langRowMapper, lang);
    }
    //
}
