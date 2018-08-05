package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "myCollection")
public class Person
{
    @Id private Integer id;
    private String name;
    private Integer age;
    @Version private Long version;


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public Long getVersion()
    {
        return version;
    }


    public void setVersion(Long version)
    {
        this.version = version;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public Integer getAge()
    {
        return age;
    }


    public void setAge(Integer age)
    {
        this.age = age;
    }
}
