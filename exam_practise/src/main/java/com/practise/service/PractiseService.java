package com.practise.service;

import java.util.ArrayList;
import java.util.List;

import com.practise.dao.PractiseDaoInterface;
import com.practise.entity.PractiseUser;
import com.practise.utility.DaoFactory;

public class PractiseService implements PractiseServiceInterface {

	PractiseDaoInterface pd;
	
	public PractiseService(){
		pd= DaoFactory.createObject("admin");
		
	}
	@Override
	public int createProfileService(PractiseUser pu) throws Exception {
		int i;
		
		
		i= pd.createProfileDao(pu);
		return i;
		
	}

	@Override
	public void viewProfileService(PractiseUser pu) {
		
		  pd.viewProfileDao(pu);
	}

	@Override
	public int deleteProfileService(String n) {
		
		int i= pd.deleteProfileDao(n);
		return i;
	}

	@Override
	public List<PractiseUser> viewallProfileService() {
		
		return pd.viewallProfileDao();
		
	}

}
