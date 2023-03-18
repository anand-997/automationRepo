package n_akola;

public class kaulkhed {
	
	public int a = 5; // public access modifier
	       int b = 10; // default access modifier
	private int c = 15; // private access modifier
    protected int d = 20;  // protected access modifier

public static void main(String[] args) {
	
	kaulkhed p = new kaulkhed();
	
	System.out.println(p.a); // p
	System.out.println(p.b);
	System.out.println(p.c);
	System.out.println(p.d); 
	
}


}

// non-static = how to call?
// access specifier  = where to call?



