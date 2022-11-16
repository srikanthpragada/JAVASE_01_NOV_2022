package assignments;

import java.util.Scanner;

public class AvgLength {

	public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       int total =0, count = 0;
       while(true)
       {
    	   System.out.print("Enter name [end to stop] :");
    	   String st = s.nextLine();
    	   if(st.equals("end"))
    		   break;
    	   
    	   total += st.length();
    	   count ++;
       }
       
       System.out.println(total/count);
	}

}
