package com.practise.utility;

import com.practise.controller.PractiseController;
import com.practise.controller.PractiseControllerInterface;
import com.practise.service.PractiseService;
import com.practise.service.PractiseServiceInterface;

public class ServiceFactory {
	
	private ServiceFactory() {
		
	}

	public static PractiseServiceInterface createObject(String pass) {
		
		PractiseServiceInterface ps= null;
		if(pass.equals("admin"))
			ps = new PractiseService();
		
		return ps;
	}

}
