package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Moe B. on 9/6/2017.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }
}
