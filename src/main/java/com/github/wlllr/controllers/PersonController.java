package com.github.wlllr.controllers;

import com.github.wlllr.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {

    @Autowired
    private PersonServices service;
}
