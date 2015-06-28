package connect;

import java.sql.*;


public class ConnectionProvider {
	
	public static Connection con=null;
	public static Connection getCon()
	{
		try
		{ 
			//flexible information driver connection password user
			String drv=System.getProperty("driver");//pass key(head) 

			String conn=System.getProperty("Connection");
			String usr=System.getProperty("user");
			String pwd=System.getProperty("pass");
			System.out.println("retrived important data as user=  "+usr+"  password=  "+pwd);
			if(con==null)
			{
				Class.forName(drv);
				con= DriverManager.getConnection(conn,usr,pwd);
				System.out.println("Connection created");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("connection provider:");
		}
		return con;
	}
		
	

}
