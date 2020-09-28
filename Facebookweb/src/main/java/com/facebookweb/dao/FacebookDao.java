package com.facebookweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.facebookweb.entity.FacebookUser;

public class FacebookDao implements DaoInterface {

	@Override
	public int createProfileDao(FacebookUser fu) throws Exception{
		int i=0;
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:c:/firstdb1;create=true","haritha","hari");
		PreparedStatement ps=con.prepareStatement("insert into FBUSER values(?,?,?,?)");
		ps.setString(1, fu.getName());
		ps.setString(2, fu.getPassword());
		ps.setString(3, fu.getEmail());
		ps.setString(4, fu.getAddress());
		
		i=ps.executeUpdate();
		
		return i;
		
		
		
	}

}
