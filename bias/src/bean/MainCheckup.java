package bean;

public class MainCheckup {
	
	
	
	
	// Checking weather points x,y are inside given triangle's co-ordinate

	public static Boolean check(int x1,int y1, int x2, int y2, int x3, int y3, int x, int y)
	{
		
		// calculating area of the whole triangle
		double A=area(x1,y1,x2,y2,x3,y3);
//		System.out.println("Value of A= "+A);
	
		
		
		
		//calculating area of triangle formed by 2 points of triangle and a given point
		double A1=area(x1,y1,x2,y2,x,y);
	//	System.out.println("Value of A1="+A1);
		
		
		
		//calculating area of triangle formed by other 2 points of triangle and a given point
		double A2=area(x2,y2,x3,y3,x,y);
//		System.out.println("Value of A2 = "+A2);
	
	
		
		
		//calculating area of triangle formed by 2 points of triangle and a given point
		double A3=area(x1,y1,x3,y3,x,y);
	//	System.out.println("Value of A3= "+A3);
		
		
		
		
		
		//calculating total area through A1+A1+A3
		double fbshits=A1+A2+A3;
		System.out.println("value of A1+A2+A3 = "+fbshits);
		
		if(A==0.0||A1==0.0||A2==0.0||A3==0.0)
			{
			System.out.println("We got a zero in area  value of A= "+A+" A1= "+A1+" A2= "+A2+" A3= "+A3);
//			return false;
			}
	
	// now making the real lEGENDRY check-up
			if(A==fbshits)
				{
				System.out.println("value of A= "+A+"  Value of fbshits= "+fbshits+"  value of comparison is : "+(A==fbshits));
					return true;
				}
			else
					return false;
	}
	
	
	
	
	// Method to calculate Area
	
	public static double area(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		double a=Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
		return a;
	}

}
