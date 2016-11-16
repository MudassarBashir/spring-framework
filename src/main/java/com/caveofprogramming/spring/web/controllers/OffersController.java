package com.caveofprogramming.spring.web.controllers;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Moe B. on 11/14/2016.
 */
@Controller
public class OffersController {

    @Autowired
    private OffersService offersService;

    @RequestMapping("/")
    public String showHome(Model model) {
        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers", offers);
        return "home";
    }
}
