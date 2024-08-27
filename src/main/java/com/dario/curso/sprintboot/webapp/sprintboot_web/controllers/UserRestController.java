package com.dario.curso.sprintboot.webapp.sprintboot_web.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dario.curso.sprintboot.webapp.sprintboot_web.models.User;
import com.dario.curso.sprintboot.webapp.sprintboot_web.models.dto.UserDto;



@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details")
    public UserDto  details(){

        UserDto userDto = new UserDto();
        User user = new User("dario", "baron", "Calle 79");

        userDto.setUser(user);
        userDto.setTitle("Hola mundo Sprintboot" );
      
        return userDto; 
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Hector", "baron", "calle");
        User user2 = new User("Luis", "buitrago", "avenida");
        User user3 = new User("hector", "santisteban", "carrera");
        
        List<User> users = Arrays.asList(user, user2, user3);
        /* 
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        */
        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){

        User user = new User("dario", "baron", "Calle 79");
        
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo Sprintboot");
        body.put("user", user);
        
        return body; 
    }
} 
