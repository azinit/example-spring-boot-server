package ru.itis.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itis.demo.models.Tech;
import ru.itis.demo.services.interfaces.TechService;

@Controller
@RequestMapping("tech")
public class TechController {
    @Autowired
    private TechService techService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("techs", techService.getList());
        return "tech";
    }

    @GetMapping("/add")
    public String add() {
        techService.addTech(new Tech(0L, "JS", "Reach", "Facebook"));
        return "tech_add";
    }
}
