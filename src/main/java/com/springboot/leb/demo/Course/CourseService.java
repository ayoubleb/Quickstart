package com.springboot.leb.demo.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository topicRepository;


        public List<Course> getAllCourses(){
            //return topics;
            List<Course> courses = new ArrayList<>();
             topicRepository.findAll().forEach(courses::add);
             return courses;
        }

    public Course getCourse(String id) {
          // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    return topicRepository.findById(id).get();
        }

    public void addCourse(Course topic) {
            topicRepository.save(topic);
    }

    public void updateCourse(String id, Course topic) {
       /* for (int i = 0; i <topics.size() ; i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }*/
        topicRepository.save(topic);

    }

    public void deleteCourse(String id) {
          //  topics.removeIf(t->t.getId().equals(id));
            topicRepository.deleteById(id);
    }
}
