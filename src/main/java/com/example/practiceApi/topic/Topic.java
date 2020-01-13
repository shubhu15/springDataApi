package com.example.practiceApi.topic;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String id;
    private String name;
    private String desp;

    public Topic() {

    }

    public Topic(String id, String name, String desp) {
        super();
        this.id = id;
        this.name = name;
        this.desp = desp;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public void setId(String id) {
        this.id = id;
    }
}
