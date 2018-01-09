package com.min.jooqtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Min
 * @Description: com.min.jooqtest.controller.MainController
 * @Date 18:12 - 2018/1/9.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String test1(){

        return "index";
    }
}
