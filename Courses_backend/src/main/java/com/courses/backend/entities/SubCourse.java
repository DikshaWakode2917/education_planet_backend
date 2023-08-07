package com.courses.backend.entities;

import java.util.UUID;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="subCourse")
@Getter
@Setter
public class SubCourse {
	
	@Id
	@Column(name = "subCourseTitle", nullable = false, length = 100)
	private String subCourseTitle;
	
	private int position;
    private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "title") 
	Course course ;

	public SubCourse() {
	}

	public SubCourse(String subCourseTitle, int position, boolean status, Course course) {
		super();
		this.subCourseTitle = subCourseTitle;
		this.position = position;
		this.status = status;
		this.course = course;
	}

	public String getSubCourseTitle() {
		return subCourseTitle;
	}

	public void setSubCourseTitle(String subCourseTitle) {
		this.subCourseTitle = subCourseTitle;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
		
	
}
