package com.codeclan.cs;
import java.util.ArrayList;

public class Student extends User {
	
	private double averageScore;
	 
	
	//constructor
	public Student(String firstName, String lastName, String email){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email= email;
		
	}
	
	private ArrayList<Project> studentsProject;
	public Student(){
		studentsProject = new ArrayList<Project>();
	}	

	 public boolean addProject(Project p){
		 return studentsProject.add(p);
	 }
	 
	
	 
	 public ArrayList<Project> getProject(){
		 return studentsProject;
	 }
	 
	
	
}
