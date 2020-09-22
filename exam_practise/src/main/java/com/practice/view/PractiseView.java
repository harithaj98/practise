package com.practice.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.practise.controller.PractiseControllerInterface;
import com.practise.utility.ControllerFactory;

public class PractiseView {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String option="y";
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		
		while(option.equals("y"))
		{
			
			System.out.println("Select the option you want to perform");
			System.out.println("press 1 to create profile");
			System.out.println("press 2 to view profile");
			System.out.println("press 3 to delete profile");
			System.out.println("press 4 to view all profiles");
			
			int choice = Integer.parseInt(br.readLine());
			
			PractiseControllerInterface pc= ControllerFactory.createObject("admin");
			switch(choice) {
			
			case 1: pc.createProfile();
					break;
			case 2: pc.viewProfile();
					break;
			case 3: pc.deleteProfile();
					break;
			case 4: pc.viewallProfile();
					break;
			}
			
			System.out.println("Do you wish to continue(y/n)?");
			option=br.readLine();
			
			
			
			
			
			
		}
		
	}

}
