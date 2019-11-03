package com.example.exception.controller;

import javax.validation.constraints.Null;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/add")
    public String add() {
        int num = 10/0;
        return "add";
    }

    @RequestMapping("/update")
    public String update() {
        String name = null;
        name = name.toLowerCase();
        return "update";
    }

    // @ExceptionHandler(value = {ArithmeticException.class})
    // public ModelAndView handleArithmeticException(Exception e) {
    //     ModelAndView modelAndView = new ModelAndView();
    //     modelAndView.addObject("exception", e.toString());
    //     modelAndView.setViewName("mathError");
    //     return modelAndView;
    // }

    // @ExceptionHandler(value = {NullPointerException.class})
    // public ModelAndView handleNullPointerException(Exception e) {
    //     ModelAndView modelAndView = new ModelAndView();
    //     modelAndView.addObject("exception", e.toString());
    //     modelAndView.setViewName("nullPointerError");
    //     return modelAndView;
    // }
}