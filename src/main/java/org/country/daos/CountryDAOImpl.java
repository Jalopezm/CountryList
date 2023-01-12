package org.country.daos;

import org.country.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CountryDAOImpl implements CountryDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<Country> countryRowMapper = (rs, rn) ->{
        Country c = new Country();
        c.setName(rs.getString("Name"));
        c.setCode(rs.getString("Code"));
        return c;
    };

    @Override
    public void save(Country c) {
        jdbcTemplate.update("Insert into country (Name) values (?)",c.getName());
    }

    @Override
    public List<Country> all() {
        return jdbcTemplate.query("select * from country", countryRowMapper);
    }
}
