package com.example.demo.controller;

import com.example.demo.model.Number;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NumberController {

    @GetMapping("/")
    public String home() {
        return "number";
    }

    @PostMapping("/check")
    public String check(@RequestParam int num, Model model) {

        Number n = new Number();
        n.setNum(num);

        String msg;

        if (num % 2 == 0) {
            msg = "Even Number";
        } else {
            msg = "Odd Number";
        }

        model.addAttribute("msg", msg);
        model.addAttribute("data", n);

        return "result";
    }
}
