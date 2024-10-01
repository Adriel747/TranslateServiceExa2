package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraslateController {
    private  TraslateService translateService;

    public TraslateController(TraslateService translateService) {
        this.translateService = translateService;
    }

    @GetMapping("/translate")
    public String translate(@RequestParam String text) {
        return translateService.translate(text);
    }
}
