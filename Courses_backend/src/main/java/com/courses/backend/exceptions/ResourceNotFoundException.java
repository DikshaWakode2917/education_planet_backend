package com.courses.backend.exceptions;

import java.util.UUID;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException{

	String resourceName;
	String fieldName;
	String fieldValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, String title) {
		super(String.format("The resource '%s' with field '%s' and value '%s' is not available", resourceName, fieldName, title));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = title;
	}
	
	
}
