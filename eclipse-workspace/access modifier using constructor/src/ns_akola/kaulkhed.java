package ns_akola;

public class kaulkhed {
	
	int p;
	
	public kaulkhed ()
	{
		System.out.println("public constructor");
		p = 25;
		System.out.println("p = " + p);
	}
	
		kaulkhed (int a)
	{
		System.out.println("default constructor");
		p = 50;
		System.out.println("p = " + p);
	}
	
	private kaulkhed (int a, int v)
	{
		System.out.println("private constructor");
		p = 75;
		System.out.println("p = " + p);
	}
	
	protected kaulkhed (int g, boolean h)
	{
		System.out.println("protected constructor");
		p = 100;
		System.out.println("p = " + p);
	}
	
	
	public static void main(String[] args) {
		

		System.out.println();
		
		new kaulkhed ();
		new kaulkhed (8);
		new kaulkhed (1,2);
		new kaulkhed (8, true);
		
		System.out.println();
		
		
		
		kaulkhed w = new kaulkhed ();
		System.out.println(w.p);
		kaulkhed x = new kaulkhed (8);
		System.out.println(x.p);
		kaulkhed y = new kaulkhed (1,2);
		System.out.println(y.p);
		kaulkhed z = new kaulkhed (8, true);
		System.out.println(z.p);
		
		
		
	
	}
}
