package com.practise.utility;

import com.practise.dao.PractiseDao;
import com.practise.dao.PractiseDaoInterface;

public class DaoFactory {
	
	private DaoFactory() {
		
	}

	public static PractiseDaoInterface createObject(String pass) {
		
		PractiseDaoInterface pd=null;
		if(pass.equals("admin"))
			pd= new PractiseDao();
		
		return pd;
	}

}
