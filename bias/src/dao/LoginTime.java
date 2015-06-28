package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;



import connect.ConnectionProvider;

public class LoginTime {
	
	
	
	public static void insert(String id, double time)
	
	{
		try{
		Connection con=ConnectionProvider.getCon();
		PreparedStatement ps=con.prepareStatement("insert into logintime values(?,?)");
		ps.setString(1,id);
		ps.setDouble(2,time);
		ps.executeUpdate();
		ps.close();
		}
		catch(Exception e){
			System.out.println("Exception in time"+e);
		}
	}

}
