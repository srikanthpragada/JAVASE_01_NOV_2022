package assignments;

import java.util.Scanner;
import java.util.StringJoiner;

public class JoinStrings {

	public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       var sj = new StringJoiner(" - ");
       while(true)
       {
    	   System.out.print("Enter name [end to stop] :");
    	   String st = s.nextLine();
    	   if(st.equals("end"))
    		   break;
    	   
    	   sj.add(st);
       }
       
       System.out.println(sj);
	}

}
