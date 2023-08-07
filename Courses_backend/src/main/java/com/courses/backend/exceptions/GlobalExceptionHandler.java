package com.courses.backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.courses.backend.payloads.ApiResponse;

//@ControllerAdvice
@RestControllerAdvice        //bcz we used apis
public class GlobalExceptionHandler {
	
		@ExceptionHandler(ResourceNotFoundException.class)
		public ResponseEntity <ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex) {
			String message = ex.getMessage();
			ApiResponse apiResponse = new ApiResponse(message,false);
			return new ResponseEntity <ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
		}
}
