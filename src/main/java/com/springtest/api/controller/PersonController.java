package com.springtest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.api.dto.PersonDTO;
import com.springtest.api.model.Person;
import com.springtest.api.repository.PersonRepository;



@RestController
@RequestMapping("/api/user")


public class PersonController {

    @Autowired
    private PersonRepository repository;

    @PostMapping
    public void create( @RequestBody  PersonDTO  req ){
       repository.save(new Person(req));
      
    }
    @GetMapping
    public List<Person> listAll(){
        return repository.findAll();
    }
    @DeleteMapping
    public void deletarUser(){
      
    }
    @PutMapping
    public void atualizarUser(){
      
    }

    
}
