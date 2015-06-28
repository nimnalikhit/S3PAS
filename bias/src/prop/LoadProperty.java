package prop;

import java.io.FileInputStream;

import java.util.*;
//to make the info flexible

public class LoadProperty {
  
	public static void loadProp(String path)
	{
		try
		{ 
		
			
			FileInputStream fin=new FileInputStream(path);
			Properties p=new Properties();
			p.load(fin );//contain info of buffer in form of key nd value
			Enumeration en=p.propertyNames();// to(fetch)get name for all properties
			while(en.hasMoreElements())
				
			{
				String key=(String)en.nextElement();//downcasting
				String value=p.getProperty(key);//give the value corrs to key 
				System.setProperty(key, value);//set the value of key nd value
				System.out.println(key+":"+value);
			}
		} 
		catch(Exception e)
		{
			System.out.println("load property:"+e);
		}
	}
}
