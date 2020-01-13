package com.example.practiceApi.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {


    @Autowired
    private CourseRepository courseRepository;
//    private List<Courses> coursesList = new ArrayList<Courses>(Arrays.asList(new Courses("spring", "Spring framework", "spring framework description"),
//                new Courses("java","core java", "core java description"),
//                new Courses("javascript", "javascript beginner", "javascript description ") ));


    public List<Courses> getCoursesList(String id){
        List<Courses> courses = new ArrayList<>();
        courseRepository.findByTopicId(id).forEach(courses::add);
        return courses;

    }


    public void addCourse(Courses courses){

        courseRepository.save(courses);
//        coursesList.add(courses);
    }
    public Courses getCourse(String id){

        return courseRepository.findById(id).get();

//        return coursesList.stream().filter(t ->t.getId().equals(id)).findFirst().get();
//        Iterator<Courses> itr = coursesList.iterator();
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

    public void updateCourse(Courses courses){
//        for (Courses t: coursesList
//             ) {
//            if(t.getId().equals(id)){
//                coursesList.set(coursesList.indexOf(t), courses);
//                return;
//            }
//        }
        courseRepository.save(courses);

    }

    public void deleteCourse(String id){

        courseRepository.deleteById(id);
//        for (Courses t: coursesList
//        ) {
//            if(t.getId().equals(id)){
//                coursesList.remove(t);
//                return;
//            }
//        }
    }

}
