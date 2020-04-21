package com.duyi.controller;


import com.duyi.bean.Guests;
import com.duyi.service.GuestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GuestsController {
    @Autowired
    private GuestsService service;
    @RequestMapping("/list")
    public String list(Model model){
        List<Guests> guestsList = service.findAll();
        model.addAttribute("guestsList",guestsList);
        return "list";
    }
    @RequestMapping("/guests/add")
    public String addGests(){
        return "add";
    }
    @Transactional
    @RequestMapping("/guests/addGests")
    public String addGests(Guests guests){
        service.add(guests);
            int num=1/0;
        return "redirect:list";
    }
}
