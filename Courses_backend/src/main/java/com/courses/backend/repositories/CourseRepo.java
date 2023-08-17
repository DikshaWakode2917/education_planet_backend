package com.courses.backend.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.courses.backend.entities.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,String>{

	

	Course findByCourseTitle(String courseTitle);



}
