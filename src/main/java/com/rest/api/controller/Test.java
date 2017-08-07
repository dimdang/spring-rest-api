package com.rest.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Dang Dim
 * Date     : 05-Aug-17, 1:13 PM
 * Email    : d.dim@gl-f.com
 */
@Controller
public class Test {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "page/login";
    }
}
