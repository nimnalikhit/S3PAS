package bean;
import java.util.ArrayList;


public class CoordinateChecker {
	
	
	
	// method to check co-ordinates
	
	public static Boolean checkCoordinate(ArrayList a, char[] r)
	{
		int x1,y1,x2,y2,x3,y3,x4,y4;
		
		System.out.println("Inside Co-ordinate Checker :");
				
		
		//converting index of ArrayList to co-ordinate
		
		String z=Character.toString(r[0]);
		String x=Character.toString(r[1]);
		String c=Character.toString(r[2]);
		String v=Character.toString(r[3]);
		
		  System.out.println("password converted to String ");
		  System.out.println("part-1 "+z);
		  System.out.println("part-2 "+x);
		  System.out.println("part-3 "+c);
		  System.out.println("part-4 "+v);

		
		  System.out.println("Getting index of these converted password");

			int k= a.indexOf(z);
			int l= a.indexOf(x);
			int m= a.indexOf(c);
			int n= a.indexOf(v);

			System.out.println("Got the indices :  Values are   "+k+" "+l+" "+m+" "+n);

			
			  System.out.println("Generating co-ordinates from the same :");
			// generating co-ordinates of x1 , y1
			x1=k/9;
			y1=k%9;
	

			// generating co-ordinates of x2,  y2
			x2=l/9;
			y2=l%9;
			
			

			// generating co-ordinates of x3, y3
			x3=m/9;
			y3=m%9;
			
			
			
			

			// generating co-ordinates of x4, y4
			x4=n/9;
			y4=n%9;
			
			System.out.println("Co-ordinates generated :   Values are "+x1+","+y1+"  "+x2+","+y2+"  "+x3+","+y3+"  "+x4+","+y4+"   Hurray!!");
			
		
			
			
			Boolean flag1=(CoordinateChecker.check(x1, y1, x2, y2,x3,y3));
		
			
			if(flag1)
			{
				System.out.println("First triangle passed the result");
				Boolean flag2=CoordinateChecker.check(x2, y2, x3, y3,x4,y4);
				
				if(flag2)
				{

					System.out.println("Second triangle passed the result");
					Boolean flag3=CoordinateChecker.check(x1, y1, x3, y3,x4,y4);
					
					if(flag3)
					{
						
						System.out.println("Third triangle passed the result");
						Boolean flag4=CoordinateChecker.check(x1, y1, x2, y2,x4,y4);
				
						if(flag4)
						{
	
							System.out.println("Fourth triangle passed the result performing triangle check-up");
												
							Boolean flag5=(CoordinateChecker.chkTriangle(x1,y1,x2,y2,x3,y3)&&CoordinateChecker.chkTriangle(x2, y2, x3, y3, x4, y4)&&CoordinateChecker.chkTriangle(x1, y1, x3, y3, x4, y4)&&CoordinateChecker.chkTriangle(x1, y1, x2, y2, x4, y4));
							if(flag5)
								return true;
						}
					}
			}
		}
	return false;
	
			
	}
			
		
	
	
	
	
	
	
	// method to check if it forms a triangle
	
	public static Boolean chkTriangle(	int x1,int y1,int x2,int y2,int x3,int y3)
	{
		System.out.println("Inside Check triangle method ");	
		if(x2-x1==0||x3-x1==0)
			return false;
		else
		{	
		int k1=(y2-y1)/(x2-x1);
		int k2=(y3-y1)/(x3-x1);
		if(k1!=k2)
			return true;
		else
			return false;
		}	
	}

	
	
	
	// check basic necessities
	
	
	
	public static Boolean check(int x1,int y1, int x2, int y2, int x3, int y3)
	{
			
		System.out.println("Inside check method of co-ordinate checker");
		int k=0;
		int minx=min(x1,x2,x3);
		int maxx=max(x1,x2,x3);
		int miny=min(y1,y2,y3);
		int maxy=max(y1,y2,y3);	
	
		
		double A=area(x1,y1,x2,y2,x3,y3);
		//	System.out.println("Inside co-ordinate checker Value of A= "+A);
		
		
	for(int i=minx;i<maxx;i++)
		
		{
			
			for(int j=miny;j<maxy;j++)
				
				{
				
				int x=i;int y=j;
					
					
				double A1=area(x1,y1,x2,y2,x,y);
				//	System.out.println("Inside co-ordinate checker Value of A1="+A1);
		
		
				double A2=area(x2,y2,x3,y3,x,y);
				//	System.out.println("Inside co-ordinate checker Value of A2 = "+A2);
	
	
		
				double A3=area(x1,y1,x3,y3,x,y);
				//	System.out.println("Inside co-ordinate checker Value of A3= "+A3);
		
		
		
				double fbshits=A1+A2+A3;
				//	System.out.println("Inside co-ordinate checker value of sum of A1, A2, A3= "+fbshits);
		
				if(A1==0.0||A==0.0||A2==0.0||A3==0.0||fbshits==0.0)
					return false;
		
		
		
		
				if(A==fbshits)
		{
			System.out.println("\nthis co-ordinate is in triangle (Start from 0,0 )\n" +x +"\t" +y);
			System.out.println("Values for this co-ordinate is A = "+A+" A1= "+A1+" A2= "+A2+" A3= "+A3);
			return true;
		}
		
}}

	return false;

	}
	
	
	
	
	
	

	// calculating minimum
	
	
	public static int min(int z1, int z2, int z3)
		
		{
			int smallest;
			if((z1<z2 && z1<z3) || (z1==z2 && z2<z3)){
			    smallest = z1;
			}else if((z2<z1 && z2<z3)||(z2==z3 && z2<z1)){
			    smallest = z2;
			}
			 else if((z3<z1 && z3<z2)|| (z1==z3 && z3<z2)){
				    smallest = z3;
			 }
			
			 else smallest=0;
		
			return smallest;
		}
	
	

		
		
		// calculating maximum
		
public static int max(int z1, int z2, int z3)
	
	{
		int largest;
		if((z1>z2 && z1>z3) || (z1==z2 && z2>z3)){
		    largest = z1;
		}else if((z2>z1 && z2>z3)||(z2==z3 && z2>z1)){
		    largest = z2;
		}
		 else if((z3>z1 && z3>z2)|| (z1==z3 && z3>z2)){
			    largest = z3;
		 }
		
		 else largest=0;
	
		return largest;
	}
	
	
	
	
	// calculating area
	
	public static double area(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		double a=Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
		return a;
	}
	
	
}
