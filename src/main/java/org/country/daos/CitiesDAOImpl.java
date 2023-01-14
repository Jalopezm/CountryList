package org.country.daos;

import org.country.model.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CitiesDAOImpl implements CitiesDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<Cities> citiesRowMapper = (rs, rn) ->{
        Cities ci = new Cities();
        ci.setName(rs.getString("Name"));
        return ci;
    };

    @Override
    public List<Cities> all(String code) {
        System.out.println(code);
        return jdbcTemplate.query("select Name from city Where CountryCode Like ?",citiesRowMapper,code);
    }
    @Override
    public void addCity(Cities city) {
        jdbcTemplate.update("insert into city (Name, CountryCode, District, Population) values (?, ?, ?, ?)",
                city.getName(),
                city.getCountryCode(),
                city.getDistrict(),
                city.getPopulation());
    }
}
