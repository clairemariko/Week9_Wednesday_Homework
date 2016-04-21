package com.codeclan.cs;

import java.util.ArrayList;

public class Tutor extends User{
	
public Tutor(String firstName, String lastName, String email){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email= email;
		
	}

	private ArrayList<Module> moduleLibrary;
	public Tutor(){
		moduleLibrary = new ArrayList<Module>();
	}	
	
	 public boolean addModule(Module m){
		 return moduleLibrary.add(m);
	 }
	 
	
	 
	 public ArrayList<Module> getModule(){
		 return moduleLibrary;
	 }

}
