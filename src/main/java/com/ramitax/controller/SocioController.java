package com.ramitax.controller;

import com.ramitax.service.SocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/socio")
public class SocioController {

    @Autowired
    private SocioService socioService;
}
