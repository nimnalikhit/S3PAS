package createdb;
import java.sql.*;

//import java.beans.Statement;
import java.io.FileInputStream;
import java.util.StringTokenizer;



import connect.ConnectionProvider;

public class CreateDB {
          
	public static void create(String path)
	{
		try
		{
			FileInputStream fin=new FileInputStream(path);
			byte[] b=new byte[fin.available()];
			fin.read(b);
			String queries=new String(b);
			StringTokenizer st=new StringTokenizer(queries,"/");
			Connection con = ConnectionProvider.getCon();
			Statement stm=con.createStatement();
			while(st.hasMoreTokens())
			{
				String query= st.nextToken();
				if(query.trim().equals("stop"))
				{
					break;
				}
				stm.execute(query);
				System.out.println(query);
			}
			System.out.println("successfully db created.........");
			
			
		}
		catch(Exception e)
		{
			System.out.println("create db:"+e);
		}
	}
}
