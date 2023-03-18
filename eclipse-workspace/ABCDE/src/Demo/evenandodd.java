package Demo;

public class evenandodd {
	

	
	public static void main(String[] args) {
		
		// even and odd 1,2,3,4,5,6,7,8,9,10,...n
		
		int range = 300;
		
		for (int num = 100; num<=range; num++)
		{
			if (num % 2 == 0)
			{
				System.out.print(num);
				System.out.println(" = number is even");
			}
			else 
			{
				System.out.print(num);
				System.out.println(" = number is odd");
			}
		}
	}

}
