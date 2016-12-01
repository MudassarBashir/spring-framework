package com.caveofprogramming.spring.web.service;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.dao.OffersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Moe B. on 11/16/2016.
 */
@Service
public class OffersService {

    @Autowired
    private OffersDAO offersDao;

    public List<Offer> getCurrent() {
        return offersDao.getOffers();
    }

    public void create(Offer offer) {
        offersDao.create(offer);
    }

    public void throwTestException() {
        offersDao.getOffer(99999);
    }
}
