package com.springtest.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.api.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
