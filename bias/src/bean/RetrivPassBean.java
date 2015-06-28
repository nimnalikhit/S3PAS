package bean;


import dao.RetrivPassDao;

public class RetrivPassBean {
	
	
	
	private String uname;
	String pass;
	
	
	
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	
	
	public String RetrivP()
	{
		try
		{	System.out.println("Inside Retrive password");
			
			RetrivPassDao d=new RetrivPassDao(this);
			
			pass=d.retrive();
			System.out.println("Password retrived in dao class = "+pass);
			

		}
		catch(Exception e)
		{
			System.out.println("loginbean / checkuser : "+e);
		}
		return pass;
	}
	
	
	
	// here we tokenize
	public char[] tokenize(String p)
	{
		System.out.println("Inside tokenizer");

	char[] k= new char[4];	
	for (int i = 0;i <4; i++)
	{
	    k[i]=p.charAt(i);
	}
	System.out.println("We just broke everything into tokens :");
	System.out.println("Lets take a look on the same ");
	for(int i=0;i<4;i++)
		System.out.println(k[i]);

	System.out.println("how is it.....");


		
	return k;	
	}
	
	

}
