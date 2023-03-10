package com.springtest.api.model;

import com.springtest.api.dto.PersonDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor


public class Person {

public Person(PersonDTO data){
    this.name=data.name();
    this.lastname=data.lastname();
    this.birth=data.birth();
    this.phone=data.phone();
    this.email=data.email();
};


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private   Long id;

    @Column( length = 50 , nullable = false)
    private String name;
    @Column( length = 50 , nullable = false)
    private String lastname;
    @Column( length = 20 , nullable = false)
    private String phone;
    @Column( length = 10 , nullable = false)
    private String birth;
    @Column( length = 100 , nullable = false)
    private String email;

}
