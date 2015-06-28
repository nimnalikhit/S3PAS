package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connect.ConnectionProvider;

import bean.RetrivPassBean;


public class RetrivPassDao {

	private RetrivPassBean rpb;
	public String pass;
	public static String id;
	
	
	public RetrivPassDao(RetrivPassBean rpb)
	{
		this.rpb=rpb;
	}
	
	
	
	public String retrive()
	{
	
		try
		{
			
		
		Connection con=ConnectionProvider.getCon();
		System.out.println("Inside dao class we just created the connection");
		PreparedStatement	ps=con.prepareStatement("Select * from reg where uemail=?");
		System.out.println("preparing the statement");
		ps.setString(1, rpb.getUname());
		System.out.println("we got the username= "+rpb.getUname());
		ResultSet rs= ps.executeQuery();
		System.out.println("query executed");
		
		
		while(rs.next())
		{
			pass=rs.getString(3);
			id=rs.getString(1);
			System.out.println("insie retrieve pass dao"+id);
		}	
		
		}
		catch(Exception e)
		{
		
			System.out.println("Exception thrown by program");
		}
		
		return decrypt();
		
	}
	
	public String decrypt()
    {
		String cipherText=pass;
		int key=3;
		
        String endResult = "";
            key = key*7;
    for(char a : cipherText.toCharArray())
        {
        for(int i = 0; i < key; i++)
        {
            if(  !(a >= 123 || a < 31))
            {
                if(a-1 != 31)
                {
                    a -= 1;
                }
                else
                {
                    a = 122;
                }
            }
            else
            {
                break;
            }
        }
        endResult += a;
    }
    return endResult;
}
	
	
}
