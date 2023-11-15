package com.example.springsecurity3sem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myaccount")
    public String myAccount() {
        return "here are the account details from db";
    }

}
