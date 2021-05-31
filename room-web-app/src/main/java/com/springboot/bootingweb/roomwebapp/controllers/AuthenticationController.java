package com.springboot.bootingweb.roomwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mohammed Amr
 * @created 31/05/2021 - 19:36
 * @project booting-web
 */

@Controller
public class AuthenticationController {

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
