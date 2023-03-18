package test;

class Test {
	
	public void unit ()
	{
		System.out.println("i am from Test class");
	}
}

class Test2 extends Test{
	
	protected void mid ()
	{
		System.out.println("i am from test2 class");
	}
}

public class Alpha2 extends Test{
	
	void end ()
	{
		System.out.println("i am from Alpha2");
	}
	
	public static void main(String[] args) {
		
		Test a = new Test ();
		a.unit();
		// a.mid(); // --> error 
		// a.end(); // --> error
		
		System.out.println();
		
		Test2 b = new Test2 ();
		b.unit();
		b.mid();
		// b.end(); // --> error
		
		System.out.println();
		
		Alpha2 c = new Alpha2 ();
		c.unit();
		// c.mid(); // --> error
		c.end();
		
		
	}

}
