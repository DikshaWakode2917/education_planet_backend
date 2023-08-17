package com.courses.backend.controllers;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courses.backend.payloads.CourseDto;
import com.courses.backend.payloads.SubCourseDto;
import com.courses.backend.services.SubCourseService;

@RestController
@RequestMapping("/api/subCourses")
public class SubCourseController {
	
	@Autowired
	private SubCourseService subCourseService;
	
//	// Post- create subCourse
//	@PostMapping
//	public ResponseEntity<SubCourseDto> createSubCourse(@RequestBody SubCourseDto subCourseDto) {
//		SubCourseDto createSubCourseDto = this.subCourseService.createSubCourse(subCourseDto);
//		return new ResponseEntity<> (createSubCourseDto, HttpStatus.CREATED);
//	}

	 @PostMapping("/{courseTitle}") // Add subcourse to a course
	    public ResponseEntity<CourseDto> addSubCourseToCourse(
	            @PathVariable("courseTitle") String courseTitle,
	            @RequestBody SubCourseDto subCourseDto) {
	        CourseDto updatedCourseDto = subCourseService.addSubCourseToCourse(courseTitle, subCourseDto);
	        return ResponseEntity.ok(updatedCourseDto);
	    }
	
//public ResponseEntity<SubCourseDto> createSubCourse(@RequestBody SubCourseDto subCourseDto, @PathVariable("subCourseId") UUID SubCourseId )
	
	@PutMapping("/{subCourseTitle}")
	public ResponseEntity<SubCourseDto> updateSubCourse(@RequestBody SubCourseDto subCourseDto, @PathVariable("subCourseTitle") String subCourseTitle) {
		 SubCourseDto updatedSubCourse = this.subCourseService.updateSubCourse(subCourseDto, subCourseTitle);
		 return ResponseEntity.ok(updatedSubCourse);
	}
	
	@DeleteMapping("/{subCourseTitle}")
	public ResponseEntity<SubCourseDto> deleteSubCourse(@PathVariable("subCourseTitle") String subCourseTitle) {
		 boolean success = this.subCourseService.deleteSubCourse(subCourseTitle);
		 if(success) {
				return new ResponseEntity(Map.of("message","SubCourse Deleted Successfully"),HttpStatus.OK);   //Use when not create ApiResponse class
			}
			else {
				return new ResponseEntity(Map.of("message","SubCourse not Available"),HttpStatus.NOT_FOUND);  

			}
	}
	
	@GetMapping("/{subCourseTitle}")
	public ResponseEntity<SubCourseDto> getSingleCourse(@PathVariable String subCourseTitle){
		return ResponseEntity.ok(this.subCourseService.getSubCourseById(subCourseTitle));
	}
	
	@GetMapping
	public ResponseEntity<List<SubCourseDto>> getAllCourses(){
		return ResponseEntity.ok(this.subCourseService.getAllSubCourses());
	}
	
}
