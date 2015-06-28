package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connect.ConnectionProvider;
import dao.LoginDAO;

public class LoginBean {
	private String user,pass;
	boolean flag=false;
	String email;
	
	public String getEmail()
	{
		return email;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public boolean checkUser()
	{
		try
		{
			LoginDAO d=new LoginDAO(this);
			flag=d.checkLogin();
			email=d.email;
		}
		catch(Exception e)
		{
			System.out.println("loginbean / checkuser : "+e);
		}
		
		return flag;
	}
	
	public String encrypt()
    {
	 
	 String text=getPass();
	 int key=3;
	 
        String endResult = "";
        key = key*7;
        for(char a : text.toCharArray())
        {
            for(int i = 0; i < key; i++)
            {
                if(  !(a >= 123 || a < 31))
                {
                    if(a+1 != 123)
                    {
                        a += 1;
                    }
                    else
                    {
                        a = 32;
                    }
                }
            }
            endResult += a;
        }
        return endResult;
    }

}





