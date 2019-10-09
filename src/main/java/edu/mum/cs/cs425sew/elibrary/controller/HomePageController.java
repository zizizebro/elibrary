package edu.mum.cs.cs425sew.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/elibrary_2", "/elibrary_2/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
