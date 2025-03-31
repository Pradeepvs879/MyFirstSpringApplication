package com.pradeep.myfirstspringapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Beyoung {

    @Autowired
    private BeyoungService beyoungService;

    @GetMapping("/get-tshirts")
    public List<TShirts> getTShirts() {
        return beyoungService.getListOfTShirts();
    }
}
