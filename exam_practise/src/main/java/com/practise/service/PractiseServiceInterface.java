package com.practise.service;

import java.util.ArrayList;
import java.util.List;

import com.practise.entity.PractiseUser;

public interface PractiseServiceInterface {

	int createProfileService(PractiseUser pu) throws Exception;

	int deleteProfileService(String n);

	List<PractiseUser> viewallProfileService();

	void viewProfileService(PractiseUser pu);

}
