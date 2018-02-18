package com.wilkhu.keeper.service;

import com.wilkhu.keeper.entity.Person;

import java.util.List;


public interface PersonService{

    List<Person> findAll();

    Person save(Person p);
}
