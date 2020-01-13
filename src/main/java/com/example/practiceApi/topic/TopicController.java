package com.example.practiceApi.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> sayTopics(){
        return  topicService.getTopicList();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable String id){

        return topicService.getTopic(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopics(@RequestBody Topic topic){

//        topicService.getCoursesList().add(topic);
        topicService.addTopic(topic);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopicId(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopicId( @PathVariable String id){
        topicService.deleteTopic( id);
    }
}
