package com.courses.backend.payloads;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ApiResponse {

	private String message;
	private boolean success;
	
	public ApiResponse() {
		super();
	}

	public ApiResponse(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}
}
