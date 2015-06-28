package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connect.ConnectionProvider;

import bean.LoginBean;

public class LoginDAO {
	
	private LoginBean login;
	public String email;
	public String id;
	boolean flag=false;
	
	public LoginDAO(LoginBean login)
	{
		this.login=login;
	}
	
	public boolean checkLogin()
	{
		try
		{
			Connection con=ConnectionProvider.getCon();
			System.out.println("yes");
			//String pass2=login.convert1();
			PreparedStatement ps=con.prepareStatement("select * from reg where uemail=? and pass=?");
			System.out.println("ok till now");
			ps.setString(1,login.getUser());
			ps.setString(2,login.encrypt());
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				
				email=rs.getString(2);
				flag=true;
	 			break;
			}
			ps.close();
		}
		catch(Exception e)
		{
			System.out.println("login dao / checklogin : "+e);
		}
		
		return flag;
	}

}
