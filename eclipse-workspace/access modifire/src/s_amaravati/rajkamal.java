package s_amaravati;

import s_akola.kaulkhed;
    					
public class rajkamal extends kaulkhed{
						// inheritance
public static void main(String[] args) {
		
		System.out.println(kaulkhed.a); // public can call with import keyword
		// System.out.println(kaulkhed.b);  // default - not work outside package
		// System.out.println(kaulkhed.c);  // private - not work outside class
		System.out.println(kaulkhed.d);  // protected - work outside package with extend keyword
	}

}
