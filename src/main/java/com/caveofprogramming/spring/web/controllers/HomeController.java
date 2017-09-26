package com.caveofprogramming.spring.web.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Moe B. on 11/16/2016.
 */
@Controller
public class HomeController {

    private static Logger logger = Logger.getLogger(HomeController.class);

    @RequestMapping("/")
    public String showHome(Model model) {
        logger.info("Showing home page ...");
        return "home";
    }

}
