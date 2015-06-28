package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connect.ConnectionProvider;

import bean.RegisterBean;

public class RegisterDAO {
	
	private RegisterBean rb;

	public RegisterDAO(RegisterBean rb)
	{
		this.rb=rb;
	}
	public void insertRecord()
	{
		try
		{
			
			Connection con=ConnectionProvider.getCon();
			PreparedStatement ps=con.prepareStatement("insert into reg values(?,?,?)");
			ps.setString(1,rb.getId());
			ps.setString(2,rb.getUser());
			ps.setString(3,rb.encrypt());
			ps.executeUpdate();
			ps.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println("register dao : "+e);
		}
	}

}
