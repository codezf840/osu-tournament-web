package com.example.osutournament.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontendController {
    @RequestMapping({
        "/",
        "/{path:[^\\.]*}",
        "/{path:^(?!api).*}/{subpath:[^\\.]*}",
        "/{path:^(?!api).*}/**/{subpath:[^\\.]*}"
    })
    public String redirect() {
        return "forward:/index.html";
    }
}
