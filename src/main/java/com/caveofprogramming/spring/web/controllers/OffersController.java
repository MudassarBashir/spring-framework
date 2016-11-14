package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Moe B. on 11/14/2016.
 */
@Controller
public class OffersController {

    @RequestMapping("/")
    public String showHome(HttpSession session) {
        session.setAttribute("name", "Boris");
        return "home"; // Names the view the use.
    }
}
