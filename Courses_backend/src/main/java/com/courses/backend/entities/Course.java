package com.courses.backend.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "courses")
@Getter
@Setter
public class Course {

    @Id
    @Column(name = "courseTitle", nullable = false, length = 100)
    private String courseTitle;
    
    private int position;
    private boolean status;
    
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubCourse> subCourses = new ArrayList<> ();

	public Course() {
	}

	public Course(String courseTitle, int position, boolean status, List<SubCourse> subCourses) {
		super();
		this.courseTitle = courseTitle;
		this.position = position;
		this.status = status;
		this.subCourses = subCourses;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<SubCourse> getSubCourses() {
		return subCourses;
	}

	public void setSubCourses(List<SubCourse> subCourses) {
		this.subCourses = subCourses;
	}
	
	
	
}