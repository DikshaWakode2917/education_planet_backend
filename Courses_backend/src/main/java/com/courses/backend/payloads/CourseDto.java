package com.courses.backend.payloads;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDto {
	
	private String courseTitle;
	private int position;
	private boolean status;
	
	
	public CourseDto() {
		
	}


	public CourseDto(String courseTitle, int position, boolean status) {
		super();
		this.setCourseTitle(courseTitle);
		this.setPosition(position);
		this.setStatus(status);
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
	
	
	
}
