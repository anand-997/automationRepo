package n_amaravati;

import n_akola.kaulkhed;

public class rajapeth extends kaulkhed{
	
	
				// inheritance for protected
	
public static void main(String[] args) {
	
	kaulkhed p = new kaulkhed();
	System.out.println(p.a);
	
	// System.out.println(p.b);
	// System.out.println(p.c);
	
	rajapeth c = new rajapeth(); // object creation for current class
	System.out.println(c.d);   // protected not work with inheritance because 2 class present with same name 
}

}
