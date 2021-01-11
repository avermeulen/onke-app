package com.onke.OnkeApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(Model model) {
        model.addAttribute("name", "Onke");

        return "hello";
    }

    @PostMapping("/hello")
    public String post(@ModelAttribute Person person, Model model) {
        System.out.println(person);
        model.addAttribute("firstName", person.getFirstName());
        return "hello";
    }

}
