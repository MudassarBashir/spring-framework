package com.caveofprogramming.spring.web.controllers;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

/**
 * Created by Moe B. on 11/14/2016.
 */
@Controller
public class OffersController {

    @Autowired
    private OffersService offersService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String showTest(Model model, @RequestParam("id") String id) {
        System.out.println("Id is: " + id);
        return "home";
    }

    @RequestMapping("/offers")
    public String showOffers(Model model) {
        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers", offers);
        return "offers";
    }

    @RequestMapping("/createoffer")
    public String createOffer(Model model, Principal principal) {

        Offer offer = null;

        if (null != principal) {
            String username = principal.getName();
            offer = offersService.getOffer(username);
        }

        if (null == offer)
            offer = new Offer();

        model.addAttribute("offer", offer);
        return "createoffer";
    }

    @RequestMapping(value = "/docreate", method = RequestMethod.POST)
    public String doCreate(Model model, @Valid Offer offer, BindingResult result, Principal principal) {
        if (result.hasErrors()) {
             return "createoffer";
        }
        offer.getUser().setUsername(principal.getName());
        offersService.saveOrUpdate(offer);
        return "offercreated";
    }
}
