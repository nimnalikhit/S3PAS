package bean;
import java.util.ArrayList;

public class CheckPoint
{

	
	// method to check password in sequence
	public static Boolean chk(ArrayList a, String p, char[] actual)
	{
		
		  System.out.println("We are inside Checkpoint.chk");
		
		
		// some declarations 
		Integer posS[]=new Integer[4];
		Integer posA[]=new Integer[4];
		int x1,y1,x2,y2,x3,y3,x4,y4;		//session password co-ordinate
		int X1,Y1,X2,Y2,X3,Y3,X4,Y4;		//actual password co-ordinate
		Boolean flag1,flag2,flag3,flag4;	// flag for check-out
		String[] q=new String[4];			// these two are used to
		String[] w=new String[4];			// store String that are converted from char
		
		
		
		// converting String to character of session password
		char[] k=new char[4];
		for(int i=0;i<4;i++)
		k[i]=p.charAt(i);
		
		  System.out.println("Session password converted to character array");
		
	
		// changing character to Strings of posS and posA
		for(int m=0;m<4;m++)
		{	
		 q[m]=Character.toString(k[m]);
		 w[m]=Character.toString(actual[m]);
		}
		
		  System.out.println("Changed the individual characters of both the passwords into String and they are :");
		
		
		  for(int j=0;j<4;j++)
			  System.out.println("actual password character "+j+"= "+w[j]+"   Session Password character "+j+"= "+q[j]);
		  
		// retrieving position of Session and Actual Password
		for(int m=0;m<4;m++)
		{
			posS[m]=a.indexOf(q[m]);
			posA[m]=a.indexOf(w[m]);
		}
		
		
		System.out.println("We got position of each type of passwords in ArrayList :");
		

		// generating co-ordinate of session password
		x1=posS[0]/9;
		y1=posS[0]%9;
		x2=posS[1]/9;
		y2=posS[1]%9;
		x3=posS[2]/9;
		y3=posS[2]%9;
		x4=posS[3]/9;
		y4=posS[3]%9;
		
System.out.println("Now the co-ordinates of Session Password are : "+x1+","+y1+"  "+x2+","+y2+"  "+x3+","+y3+"  "+x4+","+y4);		
		
		// generating co-ordinate of actual password
		X1=posA[0]/9;
		Y1=posA[0]%9;
		X2=posA[1]/9;
		Y2=posA[1]%9;
		X3=posA[2]/9;
		Y3=posA[2]%9;
		X4=posA[3]/9;
		Y4=posA[3]%9;
	
System.out.println("Now the co-ordinates of Real Password are :"+X1+","+Y1+"  "+X2+","+Y2+"  "+X3+","+Y3+"  "+X4+","+Y4);		
		

		
	//performing the real check-up
		
System.out.println("performing checkup of first digit ");
		// checking 1st part
		flag1=MainCheckup.check(X1, Y1, X2, Y2, X3, Y3, x1, y1);
	if(flag1)
	{
		System.out.println("performing checkup of second digit ");
		// checking 2nd part
		flag2=MainCheckup.check(X4, Y4, X2, Y2,X3, Y3, x2, y2);
	if(flag2)	
	{
		System.out.println("performing checkup of third digit ");
		// checking 3rd part
		flag3=MainCheckup.check(X1, Y1, X4, Y4, X3, Y3, x3, y3);
	if(flag3)	
	{
		// checking 4th part
		System.out.println("performing checkup of fourth digit ");
		flag4=MainCheckup.check(X1, Y1, X2, Y2, X4, Y4, x4, y4);
		if(flag4)
		{
			return true;	
		}
	}
	}
	}
	
			return false;
	}
	
	
}