package pune;

import mumbai.Palghar;

public class BundGarden {
	
	public static void main(String[] args) {
		
		Palghar a = new Palghar ();
		a.test ();
		// a.test (10); // default not call outside package
		// a.test ('%'); // private not call outside class
		// a.test (12, '$'); default not call outside package
	}

}
