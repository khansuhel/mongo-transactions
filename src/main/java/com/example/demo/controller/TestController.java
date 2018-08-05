package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController
{

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    TestService service;


    @PostMapping
    public void makePerson(@RequestParam Integer id)
    {
        Person p = new Person();
        p.setId(id);
        p.setName("suhel");
        p.setAge(24);
        mongoTemplate.save(p);
    }


    @PutMapping
    public void makeRequest(@RequestParam Integer id, @RequestParam boolean failIt) throws InterruptedException
    {
        service.updatePerson(id, failIt);
    }
}
