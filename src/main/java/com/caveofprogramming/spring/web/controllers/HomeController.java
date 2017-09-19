package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Moe B. on 11/16/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHome(Model model) {
        return "home";
    }

    @RequestMapping("/admin")
    public String showAdmin(Model model) {
        return "admin";
    }
}
