package com.courses.backend.services;

import java.util.List;
import java.util.UUID;

import com.courses.backend.payloads.CourseDto;
import com.courses.backend.payloads.SubCourseDto;

//public interface SubCourseService  {
//	 SubCourseDto createSubCourse(SubCourseDto subCourse);
//	 SubCourseDto updateSubCourse(SubCourseDto subCourse, String subCourseTitle);
//     SubCourseDto getSubCourseById(String subCourseTitle);
//	 List<SubCourseDto> getAllSubCourses();
//	 boolean deleteSubCourse(String subCourseTitle);
//	    CourseDto addSubCourseToCourse(String courseTitle, SubCourseDto subCourseDto); // Add this line
//	
//}

public interface SubCourseService {
    SubCourseDto createSubCourse(SubCourseDto subCourseDto);
    SubCourseDto updateSubCourse(SubCourseDto subCourseDto, String subCourseTitle);
    SubCourseDto getSubCourseById(String subCourseTitle);
    List<SubCourseDto> getAllSubCourses();
    boolean deleteSubCourse(String subCourseTitle);
    
  CourseDto addSubCourseToCourse(String courseTitle, SubCourseDto subCourseDto); // Add this line

}





