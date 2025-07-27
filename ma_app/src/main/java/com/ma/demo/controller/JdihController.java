package com.ma.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jdih")
public class JdihController {

    @GetMapping("/dokumen")
    public String getDokumen() {
        return "Dokumen hukum tersedia";
    }
}
