package com.courses.backend.payloads;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubCourseDto {
	
	private UUID subCourseId;
	private String subCourseTitle;
	private int position;
	private boolean status;
	
	
	public SubCourseDto() {
		super();
	}

	public SubCourseDto(UUID subCourseId, String subCourseTitle, int position, boolean status) {
		super();
		this.subCourseId = subCourseId;
		this.subCourseTitle = subCourseTitle;
		this.position = position;
		this.status = status;
		
	}

	public UUID getSubCourseId() {
		return subCourseId;
	}

	public void setSubCourseId(UUID subCourseId) {
		this.subCourseId = subCourseId;
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
}
