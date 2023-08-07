package com.courses.backend.services;

import java.util.List;
import java.util.UUID;

import com.courses.backend.payloads.CourseDto;

public interface CourseService {
    CourseDto createCourse(CourseDto course);
    CourseDto updateCourse(CourseDto course, String courseTitle);
    CourseDto getCourseById(String courseTitle);
    List<CourseDto> getAllCourses();
    boolean deleteCourse(String courseTitle);
}
