package Demo;

public class armstrong {
		public static void main(String[] args)
	{
		int i=0; 
		int j=0;
		int num=153; 
		int n=num;
				
		while(num>0)
		{
			i = num % 10;
			j = j + (i * i * i);
			num = num / 10;
		}
		
		if(n==j)
		{
			System.out.println( j + " is armstrong");
		}
		else
		{
			System.out.println(j + " is not armstrong");
		}
	}
}
