package com.courses.backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.courses.backend.repositories.CourseRepo;

@SpringBootTest
class CoursesBackendApplicationTests {
	
	@Autowired
	private CourseRepo courserepo;

	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void repoTest() {
		String className = this.courserepo.getClass().getName();
		String packName = this.courserepo.getClass().getName();
		System.out.println("Class Name is: "+className);
		System.out.println("Package Name is: "+packName);
	}

}
