package com.practise.dao;

import java.util.ArrayList;
import java.util.List;

import com.practise.entity.PractiseUser;

public interface PractiseDaoInterface {

	int createProfileDao(PractiseUser pu) throws Exception;

	int deleteProfileDao(String name);

	List<PractiseUser> viewallProfileDao();

	void viewProfileDao(PractiseUser pu);

	

}
