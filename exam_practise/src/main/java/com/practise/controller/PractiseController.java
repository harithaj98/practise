package com.practise.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import com.practise.entity.PractiseUser;
import com.practise.service.PractiseServiceInterface;
import com.practise.utility.ServiceFactory;

public class PractiseController implements PractiseControllerInterface {		//Controller Class
	
	PractiseServiceInterface ps;
	
	public PractiseController(){
		ps = ServiceFactory.createObject("admin");			 //Service layer object creation using factorymethod
	}

	@Override
	public void createProfile() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		try {
		System.out.println("Enter name");
		String name= br.readLine();
		System.out.println("Enter contact number");
		String phoneno= br.readLine();
		System.out.println("Enter email");
		String email= br.readLine();
		
		PractiseUser pu= new PractiseUser();
		pu.setName(name);
		pu.setPhoneno(phoneno);
		pu.setEmail(email);
		
		
		i= ps.createProfileService(pu);
		if(i==1)
			System.out.println("Profile Created");
		else System.out.println("Profile Creation failed");
		}
		
		catch( IOException e) {
			
			e.printStackTrace();
		}
		;
	}

	@Override
	public void viewProfile() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name of profile you wish to see details of");
		String n= br.readLine();
		PractiseUser pu = new PractiseUser();
		
		pu.setName(n);
		ps.viewProfileService(pu);
		}
	

	@Override
	public void deleteProfile() throws IOException {
		
		int i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of user you want to delete");
		
		String n= br.readLine();
		i= ps.deleteProfileService(n);
		
		if(i==0)
			System.out.println("User not found");
		else System.out.println("User deleted");
		
		
	}

	@Override
	public void viewallProfile() throws IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name of profile you wish to see details of");
		String n= br.readLine();
		
		List<PractiseUser> pu= ps.viewallProfileService();
		for(PractiseUser u:pu) {
			
			System.out.println("****************************************");
			System.out.println("Name is : "+u.getName());
			System.out.println("Phoneno is : "+u.getPhoneno());
			System.out.println("Email is : "+u.getEmail());
			
			System.out.println("****************************************");
			
	}

}
}
