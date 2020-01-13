package com.example.practiceApi.courses;


import com.example.practiceApi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Courses> sayCourses(@PathVariable String id){
        return  courseService.getCoursesList(id);
    }

    @RequestMapping("/topics/{topicid}/courses/{id}") // as course id is the primary key
    public Courses getCourseById(@PathVariable String id){

        return courseService.getCourse(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Courses courses, @PathVariable String topicId){
        courses.setTopic(new Topic(topicId,"",""));

//        courseService.getCoursesList().add(courses);
        courseService.addCourse(courses);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourseId(@RequestBody Courses courses, @PathVariable String id, @PathVariable String topicId){

        courses.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(courses);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteCourseId( @PathVariable String id){
        courseService.deleteCourse( id);
    }
}
