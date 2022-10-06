package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    // The implementation of the method body relies on a view technology (in this case, Thymeleaf)
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {

        // The value of the parameter is added to a Model object, ultimately making it accessible to the View template
        model.addAttribute("name", name);

        // returning the name of a View, which is responsible for rendering the HTML content
        return "greeting";
    }
}
