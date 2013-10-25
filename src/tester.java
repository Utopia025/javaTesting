import java.sql.Array;
import java.util.*;

public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int x, y, sum;  
	    Scanner input;  
	    input = new Scanner(System.in);  
	    System.out.println("Enter Date (yyyy-mm-dd):");  
	    String entry = input.next();  
	    y = input.nextInt();  
	    sum = x + y;  
	    System.out.println(x + " + " + y + " = " + sum/2); 
	   
		String temp = "a";
		Integer isIncomming = (temp.equals("true"))?1:0;
 */
		String temp1 = "::6194174583::\n Some random text blah blah";
		String[] rex = temp1.split("::");

		for (int i = 0; i < rex.length; i++) {
			System.out.println("'" + rex[i] + "'");
		}
	}

	
	static Integer mInt = 0;
}
