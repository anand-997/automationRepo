package Demo;

public class factorial {
	
	public static void main(String[] args) {
		
		// factorial number 5!= 5*4*3*2*1
		
		int number = 5;
		int result = 1;
		
		for (int i = number; i>=1; i--)
		{
			result = i * result;
			System.out.println(result);
			// 1 = 5 * 1 = 5
			// 5 = 4 * 5 = 20
		}
		
		System.out.println(result);
	}

}
