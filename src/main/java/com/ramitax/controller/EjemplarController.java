package com.ramitax.controller;

import com.ramitax.service.EjemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplar")
public class EjemplarController {

    @Autowired
    private EjemplarService ejemplarService;
}
