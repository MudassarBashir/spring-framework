package com.caveofprogramming.spring.web.controllers;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.dao.User;
import com.caveofprogramming.spring.web.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Moe B. on 9/6/2017.
 */
@Controller
public class LoginController {

    private UsersService usersService;

    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

    @RequestMapping("/denied")
    public String showDenied() {
        return "denied";
    }

    @RequestMapping("/loggedout")
    public String showLoggedOut() {
        return "loggedout";
    }

    @RequestMapping("/newaccount")
    public String showNewAccount(Model model) {

        model.addAttribute("user", new User());
        return "newaccount";
    }


    @RequestMapping(value = "/createaccount", method = RequestMethod.POST)
    public String createAccount(@Valid User user, BindingResult result) {

        if (result.hasErrors()) {
            return "newaccount";
        }

        user.setAuthority("ROLE_USER");
        user.setEnabled(true);

        if (usersService.exists(user.getUsername())) {
            result.rejectValue("username", "DuplicateKey.user.username");
            return "newaccount";
        }

        try {
            usersService.create(user);
        } catch (DuplicateKeyException e) {
            result.rejectValue("username", "DuplicateKey.user.username");
            return "newaccount";
        }


        return "accountcreated";
    }


    @RequestMapping("/admin")
    public String showAdmin(Model model) {

        List<User> users = usersService.getAllUsers();
        model.addAttribute("users", users);
        return "admin";
    }
}
