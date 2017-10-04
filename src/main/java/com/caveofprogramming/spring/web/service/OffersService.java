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
}
