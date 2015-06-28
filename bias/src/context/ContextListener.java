package context;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import prop.LoadProperty;

import createdb.CreateDB;

public class ContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent con) {
		ServletContext contxt=con.getServletContext();
		String db= contxt.getInitParameter("createdb");
		String choose=contxt.getInitParameter("choosedb");
		String oracle_path=contxt.getRealPath("WEB-INF//table//oracle_db.sql");
		String mysql_path=contxt.getRealPath("WEB-INF//table//mysql_db.sql");
		String prop_path=contxt.getRealPath("WEB-INF//property//db.properties");
		System.out.println("db:"+db);
		System.out.println("oracle path:"+oracle_path);
		System.out.println("mysql path:"+mysql_path);
		System.out.println("property path:"+prop_path);
		
		
		if(choose.equals("oracle"))
		{
			LoadProperty.loadProp(prop_path);
				
			if(db.equals("yes"))
			{
				CreateDB.create(oracle_path);
			}
		}
		
		if(choose.equals("mysql"))
		{
			LoadProperty.loadProp(prop_path);
			if(db.equals("yes"))
			{
				CreateDB.create(mysql_path);
			}
		}
		
		
		
		
		
	}

}
