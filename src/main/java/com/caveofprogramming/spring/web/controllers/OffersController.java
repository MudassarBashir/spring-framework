package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Moe B. on 11/14/2016.
 */
@Controller
public class OffersController {

    @RequestMapping("/")
    public String showHome(Model model) {
        model.addAttribute("name", "<b>Inspector Gadget</b>");
        return "home";
    }
}
