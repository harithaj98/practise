package com.practise.utility;

import com.practise.controller.PractiseController;
import com.practise.controller.PractiseControllerInterface;

public class ControllerFactory {

	private ControllerFactory(){
		
	}
	
	
	public static PractiseControllerInterface createObject(String pass) {
		
		PractiseControllerInterface pc= null;
		if(pass.equals("admin"))
			pc = new PractiseController();
		
		return pc;
			
	}

}
