package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Moe B. on 11/14/2016.
 */
@Controller
public class OffersController {

    @RequestMapping("/")
    public String showHome() {
        return "home"; // Names the view the use.
    }
}
