package lib1;

public class Boxing {

	public static void main(String[] args) {
		Object obj;
		
		 obj = "Abc";
		 obj = new Integer(100);  // boxing 
		 obj = 100;    // AutoBoxing
		 System.out.println(obj.getClass());
		 
		 Integer iobj = (Integer) obj;  // Downcasting + unboxing
		 int v = iobj.intValue();
		 int n = iobj; // autounboxing 
		 
	}
}
