package com.practise.controller;

import java.io.IOException;

public interface PractiseControllerInterface {

	void createProfile() throws Exception;
	
	void viewProfile() throws IOException;

	void deleteProfile() throws IOException;

	void viewallProfile() throws IOException;

}
