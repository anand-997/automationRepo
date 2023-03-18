package Demo;

public class palindrom {

	public static void main(String[] args) 
	{
	
		
		int num=43434;
		int i=0,j=0;
		int n=num;
		
		
		while(num>0)
		{
			i = num % 10; // 3, 4, 3
			j = (j * 10) + i; // 3, 43, 343
			num = num / 10; // 34, 3, 0
		}
		
		if(n==j)
		{
			System.out.println(n + " is palindrome");
		}
		else
		{
			System.out.println(n + " is not palindrome");
		}
	}
}
