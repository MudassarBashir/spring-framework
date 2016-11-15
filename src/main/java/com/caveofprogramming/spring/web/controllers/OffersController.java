package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
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
    public ModelAndView showHome() {
        ModelAndView mv = new ModelAndView("home");
        Map<String, Object> model = mv.getModel();
        model.put("name", "Natasha");
        return mv; // Names the view the use.
    }
}
