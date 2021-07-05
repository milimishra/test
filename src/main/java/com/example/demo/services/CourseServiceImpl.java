package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
	List<Course> list;
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(123,"java spring course","this course contains basic of java"));
		list.add(new Course(124,"python spring course","this course contains basic of jango"));
	}
	
	
	@Override
	public List<Course> getCourses()
	{
		return list;
		
	}


	@Override
	public Course getCourse(Integer courseId) {
		// TODO Auto-generated method stub
		Course c = null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}



	
}
