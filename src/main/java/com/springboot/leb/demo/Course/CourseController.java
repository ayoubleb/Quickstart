package com.springboot.leb.demo.Course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){

        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {

        return courseService.getCourse(id);
    }

    @RequestMapping(value = "/topics/{topicId}/courses",method = RequestMethod.POST)
    public void  addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }


    @RequestMapping(value = "/courses/{id}",method = RequestMethod.PUT)
    public void  updateCourse(@RequestBody Course course, @PathVariable String id){
        courseService.updateCourse(id, course);
    }

    @RequestMapping(value = "/courses/{id}",method = RequestMethod.DELETE)
    public void  deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
