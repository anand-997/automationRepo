package Demo;

public class demo1 {
	
	demo1 (int a, int b)
	{
		System.out.println("hi");
	}
	
	 int x;  // Create a class attribute

	  // Create a class constructor for the Main class
	  public demo1(int b) {
	    x = 5;  // Set the initial value for the class attribute x
	  }

	  public static void main(String[] args) {
	   // demo1 myObj = new demo1(10); // Create an object of class Main (This will call the constructor)
	  //  System.out.println(myObj.x); // Print the value of x
	    
	    new demo1 (10,11);
	  }



}
