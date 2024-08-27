package com.dario.curso.sprintboot.webapp.sprintboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dario.curso.sprintboot.webapp.sprintboot_web.models.User;
import com.dario.curso.sprintboot.webapp.sprintboot_web.models.dto.ParamDto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




    @RestController
    @RequestMapping("/api/var")
    public class PathVariableController {

        @Value("${config.username}")
        private String username;
        
       // @Value("${config.message}")
        //private String message;
        
        @Value("${config.listOfValue}")
        private String [] listOfValues;
        
        @Value("${config.code}")
        private Integer code;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        ParamDto param = new ParamDto();
        param.setMessage("este es con PathVariable " + message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mix(@PathVariable String product, @PathVariable Long id) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        //TODO: hacer algo con el el usuarui, save en la bds
        user.setName(user.getName().toUpperCase() );
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}") String message) {
        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("code", code);
        json.put("message", message);
        json.put("listOfValues", listOfValues);
        return json;
    }
    
}