package com.wilkhu.keeper.service;

import com.wilkhu.keeper.entity.Person;
import org.springframework.messaging.MessagingException;

import java.util.List;


public interface PersonService{

    List<Person> findAll();
    Person save(Person p);
    Person findById(Long id);
}
