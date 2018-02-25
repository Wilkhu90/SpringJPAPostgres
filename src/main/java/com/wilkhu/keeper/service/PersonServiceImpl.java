package com.wilkhu.keeper.service;

import com.wilkhu.keeper.dao.PersonDao;
import com.wilkhu.keeper.entity.Person;
import javafx.scene.media.MediaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
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
