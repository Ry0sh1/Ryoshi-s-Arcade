package com.ryoshi.ryoshisarcade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mvc {

    @GetMapping("/")
    public String getDefault(){
        return "index";
    }

    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/flappyBird")
    public String getFlappy(){
        return "flappyBird";
    }

    @GetMapping("/tron")
    public String getTron(){
        return "tron";
    }

    @GetMapping("/frogger")
    public String getFrogger(){
        return "frogger";
    }

}
