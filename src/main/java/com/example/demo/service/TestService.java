package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService
{
    @Autowired
    MongoTemplate mongoTemplate;


    @Transactional
    public void updatePerson(Integer id, boolean failIt) throws InterruptedException
    {
        Person person = mongoTemplate.findById(id, Person.class);
        person.setName("Suhel-1");
        Thread.sleep(1000);
        if(failIt){
            throw new RuntimeException("Failing operations");
        }
    }
}
