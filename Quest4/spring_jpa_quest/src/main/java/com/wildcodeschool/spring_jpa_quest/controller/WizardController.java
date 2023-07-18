package com.wildcodeschool.spring_jpa_quest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wildcodeschool.spring_jpa_quest.models.Wizard;
import com.wildcodeschool.spring_jpa_quest.models.WizardRepository;

@Controller
public class WizardController {
    @Autowired
    private WizardRepository repository;

    @GetMapping("/wizard")
    public String getWizard(Model model, @RequestParam(required = false) Long id) {
        Wizard wizard = new Wizard();
        if (id != null) {
            Optional<Wizard> optionalWizard = repository.findById(id);
            if (optionalWizard.isPresent()) {
                wizard = optionalWizard.get();
            }
        }
        model.addAttribute("wizard", wizard);
        return "wizard";
    }

    @GetMapping("/wizards")
    public String getAll(Model model) {
        model.addAttribute("wizard", repository.findAll());
        return "wizards";
    }

    @PostMapping("/wizard")
    public String postwizard(@ModelAttribute Wizard wizard) {
        repository.save(wizard);
        return "redirect:/wizards";
    }

    @GetMapping("/wizard/delete")
    public String deleteWizard(@RequestParam Long id) {
        repository.deleteById(id);
        return "redirect:/wizards";
    }
}
