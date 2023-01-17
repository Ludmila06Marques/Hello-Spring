package com.springtest.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.api.dto.UserDTO;

@RestController
@RequestMapping("/api/users")

public class UserController {

    @GetMapping
    public String pegarUser(){
        return "Ola spring";
    }
    @PostMapping
    public void postarUser( @RequestBody  UserDTO  req ){
        System.out.println(req.name());
      
    }
    @DeleteMapping
    public void deletarUser(){
      
    }
    @PutMapping
    public void atualizarUser(){
      
    }

    
}
