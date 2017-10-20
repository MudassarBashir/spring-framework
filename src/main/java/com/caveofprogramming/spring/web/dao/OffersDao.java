package com.caveofprogramming.spring.web.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Transactional
@Repository
@Component("offersDao") public class OffersDao {

    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    SessionFactory sessionFactory;

    Session session() {
        return sessionFactory.getCurrentSession();
    }

    @Autowired public void setDataSource(DataSource jdbc) {
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    @SuppressWarnings("unchecked")
    public List<Offer> getOffers() {

        Criteria criteria = session().createCriteria(Offer.class);
        criteria.createAlias("user", "u").add(Restrictions.eq("u.enabled", true));
        return criteria.list();

    }

    @SuppressWarnings("unchecked")
    public List<Offer> getOffers(String username) {

        Criteria criteria = session().createCriteria(Offer.class);
        criteria.createAlias("user", "u");
        criteria.add(Restrictions.eq("u.enabled", true));
        criteria.add(Restrictions.eq("u.username", username));
        return criteria.list();
    }

    public void saveOrUpdate(Offer offer) {

        session().saveOrUpdate(offer);

    }

    public boolean delete(int id) {

        Query query = session().createQuery("delete from Offer where id=:id");
        query.setLong("id", id);
        return query.executeUpdate() == 1;
    }

    public Offer getOffer(int id) {

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        return jdbc.queryForObject(
                "select * from offers, users where offers.username=users.username and users.enabled=true and id=:id",
                params, new OfferRowMapper());
    }

}