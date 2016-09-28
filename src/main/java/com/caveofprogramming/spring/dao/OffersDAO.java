package com.caveofprogramming.spring.dao;

import com.caveofprogramming.spring.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by mbashir on 8/12/2016.
 */
@Component("offersDao")
public class OffersDAO {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Offer> getOffers() {

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", "Sue");

        return jdbcTemplate.query("select * from offers where name = :name", params, new RowMapper<Offer>() {

            public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
                Offer offer = new Offer();

                offer.setId(rs.getInt("id"));
                offer.setName(rs.getString("name"));
                offer.setEmail(rs.getString("email"));
                offer.setText(rs.getString("text"));

                return offer;
            }
        });
    }

    public Offer getOffer(int id) {

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        return jdbcTemplate.queryForObject("select * from offers where id = :id", params, new RowMapper<Offer>() {

            public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
                Offer offer = new Offer();

                offer.setId(rs.getInt("id"));
                offer.setName(rs.getString("name"));
                offer.setEmail(rs.getString("email"));
                offer.setText(rs.getString("text"));

                return offer;
            }
        });
    }

    public boolean create(Offer offer) {

        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
        return jdbcTemplate.update("insert into offers (name, text, email) values (:name, :text, :email)",
                                    params) == 1;
    }

    public boolean update(Offer offer) {

        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
        return jdbcTemplate.update("update offers set name=:name, text=:text, email=:email where id=:id",
                params) == 1;
    }

    public boolean delete(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource("id", id);
        return jdbcTemplate.update("delete from offers where id=:id", params) == 1;
    }

}
