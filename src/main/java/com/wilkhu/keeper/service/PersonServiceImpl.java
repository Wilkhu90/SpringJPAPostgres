package com.wilkhu.keeper.service;

import com.wilkhu.keeper.dao.PersonDao;
import com.wilkhu.keeper.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> findAll() {
        return (List<Person>) personDao.findAll();
    }

    @Override
    public Person save(Person p) {
        return (Person) personDao.save(p);
    }

    @Override
    public Person findById(Long id) {
        return (Person) personDao.getOne(id);
    }

}
