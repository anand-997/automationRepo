package pune;

import mumbai.Palghar;

public class Shukrawari extends Palghar{
	
	public static void main(String[] args) {
		
		Palghar a = new Palghar ();
		a.test ();
		// a.test (10); // default not call outside package
		// a.test ('%'); // private not call outside class
		
		Shukrawari x = new Shukrawari();
		x.test (12, '$');
	}

}
