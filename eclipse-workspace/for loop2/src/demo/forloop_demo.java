package demo;

public class forloop_demo {
	
	public static void main(String[] args) 
	{
		
		for ( int a=1; a<4; a++)
		{
			System.out.println("a");
			System.out.println("b");
		}
		
		
		for ( int a=1; a<4; a++)
		{
			for ( int b=10; b>1; b--)
			{
				System.out.print("*");
			
			}
			System.out.println("a");
		
		}
		
		
		
		for ( int a=1; a<4; a++)
		{
			for ( int b=1; b<5; b++)
			{
				System.out.print("b");
			
			}
			System.out.println();
		
		} 
		
		
		for ( int a = 1; a<=14; a++)
				{
					for ( int b=1; b<=a; b++)
					{
						System.out.print("*");
					
					}
					System.out.println(" ");
				
				}
		
	}

}
