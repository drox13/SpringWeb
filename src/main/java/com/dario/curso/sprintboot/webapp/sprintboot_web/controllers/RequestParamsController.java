package com.dario.curso.sprintboot.webapp.sprintboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.dario.curso.sprintboot.webapp.sprintboot_web.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/params")

public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "No hay datos", name = "mensaje") String message) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;
    }

    @GetMapping("/bar")
    public ParamDto getMethodName(@RequestParam String text, @RequestParam Integer code) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(text);
        paramDto.setCode(code);
        return paramDto;
    }


    @GetMapping("/request")
    public ParamDto request(HttpServletRequest request) {
        Integer code = 0;
        try {
           code =  Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            // TODO: handle exception
        }
        ParamDto params = new ParamDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params; 
    }
    
    
    
}
