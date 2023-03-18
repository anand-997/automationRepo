package mumbai;

public class Palghar {
	
	public void test ()
	{
		System.out.println("public test");
	}
	void test (int x)
	{
		System.out.println("default test");
	}
	private void test (char y)
	{
		System.out.println("private test");
	}
	protected void test (int z, char w)
	{
		System.out.println("protected test");
	}
	
	public static void main(String[] args) {
		
		Palghar a = new Palghar ();
		a.test ();
		a.test (10);
		a.test ('%');
		a.test (12, '$');
		
	}

}
