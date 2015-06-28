package bean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ShufflinList {

	
	public static ArrayList ArrayListGenerator()
	
	{
		   System.out.println("Inside ShufflinArrayList :");
		   
	// Generating array list :-p
	ArrayList a= new ArrayList();
	
	   System.out.println("Shuffling ArrayList-ArrayList Generated : adding data to it :");
	   
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");
		a.add("F");
		a.add("G");
		a.add("H");	
		a.add("I");
		a.add("J");
		a.add("K");
		a.add("L");	
		a.add("M");
		a.add("N");
		a.add("O");
		a.add("P");
		a.add("Q");
		a.add("R");
		a.add("S");
		a.add("T");
		a.add("U");
		a.add("V");
		a.add("W");
		a.add("X");
		a.add("Y");
		a.add("Z");
		
		
		a.add("0");
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		a.add("6");
		a.add("7");
		a.add("8");
		a.add("9");
		
		
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		a.add("f");
		a.add("g");
		a.add("h");
		a.add("i");
		a.add("j");
		a.add("k");
		a.add("l");
		a.add("m");
		a.add("n");
		a.add("o");
		a.add("p");
		a.add("q");
		a.add("r");
		a.add("s");
		a.add("t");
		a.add("u");
		a.add("v");
		a.add("w");
		a.add("x");
		a.add("y");
		a.add("z");
		
		a.add("@");
		a.add("#");
		a.add("!");
		a.add("$");
		a.add("%");
		a.add("^");
		a.add("&");
		a.add("*");
		a.add("-");
		a.add("<");
		a.add("=");
		a.add("+");
		a.add("[");
		a.add("{");
		a.add("]");
		a.add("}");
		a.add("?");
		a.add("|");
		a.add(">");
		
		
		
		

		
		
		//Checking data inside ArrayList
		 Iterator it= a.iterator();
		 System.out.println("Content of Arralist are :");
		 while(it.hasNext())
		 {
		 System.out.println((String)it.next());
		 }
		 
		  
		 System.out.println("Returning ArrayList :");
		return a;
	}
	
	
	
	// method that will shuffle the list
	public static ArrayList shuffler(ArrayList k)
	{
	Collections.shuffle(k);
	return k;
	}
	
	
	
}
