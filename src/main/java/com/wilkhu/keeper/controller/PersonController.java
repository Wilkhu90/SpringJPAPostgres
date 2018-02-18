package com.wilkhu.keeper.controller;

import com.google.gson.Gson;
import com.wilkhu.keeper.entity.Person;
import com.wilkhu.keeper.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @RequestMapping("/api/getPersons")
    public ResponseEntity<List<Person>> getPersons() {
        List<Person> people = service.findAll();
        return new ResponseEntity<List<Person>>(people, HttpStatus.OK);
    }
    @RequestMapping("/api/getPerson")
    public ResponseEntity<Person> getPerson(@RequestParam(name = "id") Long id) {
        Person p = service.findById(id);
        return new ResponseEntity<Person>(p, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/addPersons", method = RequestMethod.POST)
    public ResponseEntity<Person> savePerson(@RequestBody String str) {
        Gson util = new Gson();
        Person p = util.fromJson(str, Person.class);
        service.save(p);
        return new ResponseEntity<Person>(p, HttpStatus.CREATED);
    }
}
