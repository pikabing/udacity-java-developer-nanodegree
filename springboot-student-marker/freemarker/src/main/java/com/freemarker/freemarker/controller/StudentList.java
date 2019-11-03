package com.freemarker.freemarker.controller;

import java.util.ArrayList;
import java.util.List;

import com.freemarker.freemarker.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentList {

    @RequestMapping("list")
    public String studentList(Model model) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Tom", 80.5));
        list.add(new Student(2, "Jerry", 90.4));
        list.add(new Student(3, "Paul", 77.5));
        model.addAttribute("list", list);
        return "student_list";
    }
}