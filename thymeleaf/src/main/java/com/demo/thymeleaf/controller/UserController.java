package com.demo.thymeleaf.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.demo.thymeleaf.model.UserModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/demo")
    public String demo(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        double grade = 60.5;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGPA(grade));
        return "demo";
    }

    @RequestMapping("demo2")
    public String demo2(Model model) {
        List<UserModel> lst = new ArrayList<>();
        lst.add(new UserModel(1, "Tom", 43));
        lst.add(new UserModel(2, "Jerry", 59));
        lst.add(new UserModel(3, "Nancy", 78));
        model.addAttribute("list", lst);
        return "demo2"; 
    }

    @RequestMapping("demo3")
    public String demo3(HttpServletRequest request, Model model) {
        // Request
        request.setAttribute("request", "request data");
        // Session
        request.getSession().setAttribute("session", "session data");
        // Application
        request.getSession().getServletContext().setAttribute("application", "application data");
        return "demo2";
    }

   @RequestMapping("/add")
   public String toAdd(UserModel userModel) {
       return "add";
   }

   @RequestMapping("addUser")
   public String add(@Valid UserModel userModel, BindingResult bind) {
        if(bind.hasErrors())
            return "add";

        System.out.println("Saving user + " + userModel.getName() + "..." );
        return "success";
   }
    
   private String convertGPA(double grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade < 90 && grade >= 80) {
            return "B";
        } else if (grade < 80 && grade >= 70) {
            return "C";
        } else if (grade < 70 && grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}