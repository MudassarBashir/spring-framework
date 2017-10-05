package com.caveofprogramming.spring.web.service;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.dao.OffersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Moe B. on 11/16/2016.
 */
@Service
public class OffersService {

    @Autowired
    private OffersDao offersDao;

    public List<Offer> getCurrent() {
        return offersDao.getOffers();
    }

    @Secured({"ROLE_USER", "ADMIN_USER"})
    public void create(Offer offer) {
        offersDao.create(offer);
    }

    public boolean hasOffer(String name) {
        if (null == name)
            return false;

        List<Offer> offers = offersDao.getOffers(name);
        return !offers.isEmpty();
    }

    public Offer getOffer(String username) {

        List<Offer> offers = offersDao.getOffers(username);

        if (null == username || offers.isEmpty())
            return null;

        return offers.get(0);
    }

    public void saveOrUpdate(Offer offer) {

        if (offer.getId() != 0) {
            offersDao.update(offer);
        }
        else {
            offersDao.create(offer);
        }
    }

    public void delete(int id) {
        offersDao.delete(id);
    }
}
