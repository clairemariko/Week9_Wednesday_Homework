package com.codeclan.cs;

import static org.junit.Assert.*;

import org.junit.*;

	public class StudentTest {

		@Test
		public void TestStudentName(){
			User u = new Student("claire", "smith", "claire123@hotmail.com");
			assertEquals("claire", u.firstName);
							
		}
		
		@Test
		public void TestStudentSurname(){
			User u = new Student("Tom", "Anderson", "tommy@gmail");
			assertEquals("Anderson", u.getLastName());
		}
		
		//make a test to see if can add project
//		@Test
//		public void TestStudentAddProject(){
//			
//		}
	}


	