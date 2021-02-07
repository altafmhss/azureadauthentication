package com.svscorp.svscorp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
public class HelloController {

    @GetMapping("/appusers")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_appusers')")
    public String group1() {
        return "Hello appusers 1 Users!";
    }

    @GetMapping("group2")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_group2')")
    public String group2() {
        return "Hello Group 2 Users!";
    }
}