package com.practise.dao;

import java.util.ArrayList;
import java.util.List;

import com.practise.entity.PractiseUser;



public class PractiseDao implements PractiseDaoInterface {

	private List<PractiseUser> lu= new ArrayList<>();
	
	@Override
	public int createProfileDao(PractiseUser pu) throws Exception{
		
		int i=0;
		
		if(lu.add(pu))
			i=1;
		
		return i;
		
	
		
	}

	@Override
	public void viewProfileDao(PractiseUser pu) {
		
		
		System.out.println("In dao "+ pu.getName());
		for(PractiseUser u:lu) {
			
			if(u.getName().equals(pu.getName())) {
			System.out.println("****************************************");
			System.out.println("Name is : "+u.getName());
			System.out.println("Phoneno is : "+u.getPhoneno());
			System.out.println("Email is : "+u.getEmail());
			
			System.out.println("****************************************");
			}
		}
		
		
		
		
		
	}

	@Override
	public int deleteProfileDao(String name) {
		
		int i=0;
		for(PractiseUser u:lu) {
			
			if(name.equals(u.getName())) {
				lu.remove(u);
				i=1;
			}
		}
		
		return i;
	}

	@Override
	public List<PractiseUser> viewallProfileDao(){
		
		return lu;
		
	}

	
	

}
