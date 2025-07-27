package com.ma.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/diktum")
public class DiktumController {

    @GetMapping("/rumusan")
    public String getRumusan() {
        return "Rumusan hukum dari DIKTUM";
    }
}
