package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseService;


@RestController
@RequestMapping
public class DemoController {
	
	@Autowired
	private CourseService  courseService;
	    @GetMapping("/hello")
	    public String hello() {
	        return "Hello World!!";
	    }

	    @GetMapping("/courses")
	    public List<Course> getCourses()
	    {
	    	return this.courseService.getCourses();
	    }
	    
	    @GetMapping("/courses/{courseId}")
	    public Course getCourse( @PathVariable String courseId)
	    {
	    	return this.courseService.getCourse(Integer.parseInt(courseId));
	    }
	    
	    @PostMapping(path="/courses",consumes ="application/json")
	    public Course addCourse(@RequestBody Course course )
	    {
	    	return this.courseService.addCourse(course);
	    }
}
