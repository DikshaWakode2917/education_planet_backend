package com.courses.backend.services.Impl;
import java.util.List;
import java.util.stream.Collectors;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.backend.entities.Course;
import com.courses.backend.exceptions.ResourceNotFoundException;
import com.courses.backend.payloads.CourseDto;
import com.courses.backend.repositories.CourseRepo;
import com.courses.backend.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo courserepo;
	
	
	@Override
	public CourseDto createCourse(CourseDto courseDto) {
		Course course = this.dtoToCourse(courseDto);
		Course savedCourse = this.courserepo.save(course);
		return this.courseToDto(savedCourse);
	}
 
	@Override
	public CourseDto updateCourse(CourseDto courseDto, String courseTitle) {
		Course course = this.courserepo.findById(courseTitle).orElseThrow((()->new ResourceNotFoundException("Course","id",courseTitle)));
	
		
		course.setCourseTitle(courseDto.getCourseTitle());
		course.setPosition(courseDto.getPosition());
		course.setStatus(courseDto.isStatus());
		
		
		Course updatedCoursed = this.courserepo.save(course);
		CourseDto courseDto1 = this.courseToDto(course);
		
		return courseDto1;
	}

	@Override
	public CourseDto getCourseById(String courseTitle) {
		Course course = this.courserepo.findById(courseTitle).orElseThrow((()->new ResourceNotFoundException("Course", "Id", courseTitle )));
		return this.courseToDto(course);
	}

	@Override
	public List<CourseDto> getAllCourses() {
		
		List<Course> courses = this.courserepo.findAll();
		List<CourseDto> courseDtos = courses.stream().map(course->this.courseToDto(course)).collect(Collectors.toList());
		
		return courseDtos;
	}

	@Override
	public boolean deleteCourse(String courseTitle) {
		Course empty_course = new Course();
		//Course course = this.courserepo.findById(courseId).orElseThrow(()->new ResourceNotFoundException("Course", "Id", courseId ));
		Course course = this.courserepo.findById(courseTitle).orElse(empty_course);
		//this.courserepo.delete(course);
		if(course.getCourseTitle() == courseTitle) {
		this.courserepo.delete(course);
			return true;
		}
		else {
			return false;
		}
	}
	
	

	
	public Course dtoToCourse(CourseDto courseDto) {
		Course course = new Course();
		course.setCourseTitle(courseDto.getCourseTitle());
		course.setPosition(courseDto.getPosition());
		course.setStatus(courseDto.isStatus());
		return course;
		
	}
	
	public CourseDto courseToDto(Course course) {
		CourseDto courseDto = new CourseDto();
		courseDto.setCourseTitle(course.getCourseTitle());
		courseDto.setPosition(course.getPosition());
		courseDto.setStatus(course.isStatus());
		return courseDto;
	}
}


