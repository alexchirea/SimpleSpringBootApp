package com.alexchirea.SimpleSpringBootApp.controller;

import com.alexchirea.SimpleSpringBootApp.model.Person;
import com.alexchirea.SimpleSpringBootApp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PersonsController {

    @Autowired
    private PersonRepository repository;

    @GetMapping
    public String showAllPersons(Model model) {
        model.addAttribute("persons", repository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String showAddPersonForm(Person person) {
        return "add-person";
    }

    @PostMapping("/add")
    public String addPerson(@Valid Person person, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-person";
        }

        repository.save(person);
        return "redirect:/index";
    }

}
