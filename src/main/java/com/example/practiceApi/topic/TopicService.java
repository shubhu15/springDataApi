package com.example.practiceApi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TopicService {


    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getTopicList(){
        List<Topic> topics = new ArrayList<Topic>();
        topicRepository.findAll().forEach(topics::add);
        return topics;

    }


    public void addTopic(Topic topic){

        topicRepository.save(topic);
//        topicList.add(topic);
    }
    public Topic getTopic(String id){

        return topicRepository.findById(id).get();

//        return topicList.stream().filter(t ->t.getId().equals(id)).findFirst().get();
//        Iterator<Courses> itr = topicList.iterator();
//
//      while(itr.hasNext()){
//          Courses t = itr.next();
//          if(t.getId().equals(id)){
//              return t;
//          }
//
//      }
//      return null;

    }

    public void updateTopic(Topic topic, String id){
//        for (Courses t: topicList
//             ) {
//            if(t.getId().equals(id)){
//                topicList.set(topicList.indexOf(t), topic);
//                return;
//            }
//        }
        topicRepository.save(topic);

    }

    public void deleteTopic(String id){

        topicRepository.deleteById(id);
//        for (Courses t: topicList
//        ) {
//            if(t.getId().equals(id)){
//                topicList.remove(t);
//                return;
//            }
//        }
    }

}
