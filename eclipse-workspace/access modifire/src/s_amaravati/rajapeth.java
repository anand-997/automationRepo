package s_amaravati;

import s_akola.*;  // for public for this program only
import n_akola.*;

public class rajapeth {
	
public static void main(String[] args) {
		
		System.out.println(s_akola.kaulkhed.a);     // public can call with import keyword
		// System.out.println(kaulkhed.b);  // default - not work outside package
		// System.out.println(kaulkhed.c);  // private - not work outside class
		// System.out.println(kaulkhed.d);  // protected - not work outside package
	}

}
