package Demo;

public class findvalue 
{

	public static void main(String[] args)

	{ 
		int a = 5;
		int b = 4;
		int c = 33;
		int d = 231;
		int e = 1545;
		
		if (a>b)
		{
			if (a>c)
			{
				if (a>d)
				{
					if (a>e)
					{
						System.out.println("a is larger value");
						System.out.println(a);
					}
					else
					{
						System.out.println("e is larger value");
						System.out.println(e);
					}
				}
				else
				{
					if (d>b)
					{
						if (d>c)
						{
							if (d>e)
							{
								System.out.println("d is larger value");
								System.out.println(d);
							}
							else
							{
								System.out.println("e is larger value");
								System.out.println(e);
							}
						}
						else
						{
							if (c>b)
							{
								if (c>e)
								{
									System.out.println("c is larger value");
									System.out.println(c);
								}
								else
								{
									System.out.println("e is larger value");
									System.out.println(e);
								}
							}
							else
							{
								if (b>e)
								{
									System.out.println("b is larger value");
									System.out.println(b);
								}
								else
								{
									System.out.println("e is larger value");
									System.out.println(e);
								}
							}
						}
					}
					else
					{
						System.out.println("b is larger value");
						System.out.println(b);
					}
				}
			}
			else
			{
				if (c>b)
				{
					System.out.println("c is larger value");
					System.out.println(c);
				}
				else
				{
					System.out.println("b is larger value");
					System.out.println(b);
				}
			}
		}
		else
		{
			System.out.println("b is larger value");
			System.out.println(b);
		}
	}
}
