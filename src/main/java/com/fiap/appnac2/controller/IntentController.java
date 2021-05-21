package com.fiap.appnac2.controller;

import com.fiap.appnac2.dto.Intent;
import com.fiap.appnac2.service.impl.IntentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class IntentController {
    @Autowired
    IntentServiceImpl service;

    @GetMapping("new-intent")
    public ModelAndView homeProduto() {
        ModelAndView view = new ModelAndView("intent");
        view.addObject("intent",new Intent());
        return view;
    }

    @PostMapping("save-intent")
    public String salvarProduto(@Valid Intent intent, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute(intent);
            return "intent";
        }
        service.intentSave(intent);
        return "redirect:/";
    }

    @GetMapping("/intent/{id}")
    public ModelAndView editarProduto(@PathVariable Long id) {
        ModelAndView view = new ModelAndView("intent");
        Intent intent = service.editIntent(id);
        view.addObject("intent", intent);
        return view;
    }
}
