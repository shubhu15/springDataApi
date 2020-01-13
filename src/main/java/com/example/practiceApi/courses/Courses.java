package com.example.practiceApi.courses;


import com.example.practiceApi.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Courses {

    @Id
    private String id;
    private String name;
    private String desp;

    @ManyToOne
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Courses() {

    }

    public Courses(String id, String name, String desp, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.desp = desp;
        this.topic = new Topic(topicId,"","");
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
