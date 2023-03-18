package String_program;

public class Count {
	
	public static void main(String[] args) {
		
		// character count
		
		String s = "Anand";
		int count = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.println("total count of char is " + count);
	}

}
