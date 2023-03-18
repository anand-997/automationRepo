package demo;

public class testclass2 

{
public static void main(String[] args)

	{ 
	int a = 546545;
	int b = 341; 
	int c = 216;
	int d = 64654;
  
	if (a>b)
	{
		if (a>c)
		{
			if (a>d)
			{
				System.out.println("a is larger value");
				System.out.println(a);
			}
			else
			{
				System.out.println("d is larger value");
				System.out.println(d);
			}
		}
		else
		{
			System.out.println("c is larger value");
			System.out.println(c);

		}
	}
	else 
		{
			if (b>c)
			{
				if (b>d)
				{
					System.out.println("b is larger value");
					System.out.println(b);
				}
				else
				{
					System.out.println("d is larger value");
					System.out.println(d);
				}
			}
			else
			{
				if (c>d)
				{
					System.out.println("c is larger value");
					System.out.println(c);
				}
				else
				{
					System.out.println("d is larger value");
					System.out.println(d);
				}

			}
		}

	}
	
 	}
 
