package bean;

import dao.RegisterDAO;

public class RegisterBean {
	private String user,pass;
	
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
	
	public String getId()
	{
		double d=Math.random();
		double d1=Math.random();
		long l1=(long)(d*1000000);
		long l2=(long)(d*1000000);
		return "A"+l1+"B"+l2+"A";
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
	
	public void insert()
	{
		System.out.println("check pass : "+this.pass);
		RegisterDAO d=new RegisterDAO(this);
		d.insertRecord();
	}

}
