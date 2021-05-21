package com.fiap.appnac2.controller;

import com.fiap.appnac2.dto.Intent;
import com.fiap.appnac2.service.impl.IntentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private IntentServiceImpl service;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("home");
        List<Intent> intents = service.intentList();

        view.addObject("intents", intents);
        return view;
    }
}
