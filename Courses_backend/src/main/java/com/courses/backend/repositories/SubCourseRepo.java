package com.courses.backend.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.backend.entities.SubCourse;

public interface SubCourseRepo  extends JpaRepository<SubCourse, String>{

}
