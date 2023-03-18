package Demo;

public class fibonabbci {
	
	public static void main(String[] args) {
		
		// fibobabbcy 0,1,1,2,3,5,8,13...n
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		int count = 15;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for (int i = 1; i<=count; i++) //  line
		{
			n3 = n1 + n2;  // 0 + 1 = 1
			System.out.println(n3);
			n1 = n2; // n1 = 0 / n1 = n2 = 1
			n2 = n3; // n2 = 1 / n2 = n3 = 1
		}
	}

}
