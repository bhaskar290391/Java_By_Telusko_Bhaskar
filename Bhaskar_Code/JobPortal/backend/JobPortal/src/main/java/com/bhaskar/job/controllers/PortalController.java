package com.bhaskar.job.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PortalController {

    @RequestMapping({"/","home"})
    public String home(){
        return "home";
    }


    @RequestMapping({"addjob"})
    public String addjob(){
        return "addjob";
    }
}
