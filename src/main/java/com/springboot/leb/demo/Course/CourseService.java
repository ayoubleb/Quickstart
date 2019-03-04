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
            List<Course> courses = new ArrayList<>();
             topicRepository.findAll().forEach(courses::add);
             return courses;
        }

    public Course getCourse(String id) {

    return topicRepository.findById(id).get();
        }

    public void addCourse(Course topic) {
            topicRepository.save(topic);
    }

    public void updateCourse(String id, Course topic) {

        topicRepository.save(topic);

    }

    public void deleteCourse(String id) {

            topicRepository.deleteById(id);
    }
}
