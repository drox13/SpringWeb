package com.dario.curso.sprintboot.webapp.sprintboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.dario.curso.sprintboot.webapp.sprintboot_web.models.User;


@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("dario", "baron");
        user.setAddress("calle 79");

        model.addAttribute("title", "Hola mundo Sprintboot");
        model.addAttribute("user", user);
        
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap modelMap) {
         
        //modelMap.addAttribute("users", users);
        modelMap.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel(){
        return Arrays.asList(
            new User("pepa", "ping"),
            new User("lalo", "perez", "lalo@correo.com"),
            new User("Juanita", "Rosa", "juana@correo.com"),
            new User("Andres", "Doe"));
    }
    
} 
