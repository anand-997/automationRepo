package demo;

public class forloop_demo {
	
public static void main(String[] args) 
	{
	int ascii = 65;
	
	for (int i = 0; i<=5; i++)
	{
		for (int k=6; k>=i; k--)
		{
			System.out.print(" ");
		}
		for (int j=0; j<=i; j++)
		{
			System.out.print((char)(+ ascii+j));
		}
		System.out.println();
	}
	
	
	// peramid
	for (int i=1; i<=11; i++)
	{
		
		for (int j=11; j>=i; j--)
		{
			System.out.print(" ");
		}
		
		for (int j=1; j<=i; j++)
		{
			System.out.print("* ");
		}
		
			System.out.println();
	}
	// ulta peramid
	for (int a=10; a>=1; a--)
	{
		
		for (int b=11; b>=a; b--)
		{
			System.out.print(" ");
		}
		
		for (int b=1; b<=a; b++)
		{
			System.out.print("* ");
		}
		
			System.out.println();
	}
	
	System.out.println();
	
	// peramid
	for (int i=1; i<=11; i++)  // line
	{
		
		for (int j=11; j>=i; j--) // space
		{
			System.out.print(" ");
		}
		
		for (int j=1; j<=i; j++) // star 1
		{
			System.out.print("*");
		}
		
		for (int k=1; k<=i-1; k++) 	// star 2
		{
			System.out.print("*");
		}
		
			System.out.println();
	}
	
	
	// peramid
	
	for (int p=1; p<=10; p++)
	{
		for (int q=0; q<=p; q++)
		{
			System.out.print(" ");
		}
		for (int q=11; q>=p; q--)
		{
			System.out.print("*");
		}
		for (int q=9; q>=p+1; q--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	// box
	for (int x = 1; x<=10; x++)
	{
		System.out.println("**********");
	}
	
	}

}
