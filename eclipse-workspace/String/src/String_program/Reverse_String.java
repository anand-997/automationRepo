package String_program;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String s = "Vinod"; // s[0]
		String v = "Vinod";
		
		String a = new String ("Vinod");
		String b = new String ("Vinod");
		String x = "";
		for (int i = 0; i < s.length(); i++) // 2nd quadrant
		{
			x = x + s.charAt(i);
			System.out.println(x);
		}
		
		
		String y = "";
		for (int j = (s.length()-1); j >= 0; j--)  // doniV---reverse
		{
			y = y + s.charAt(j);
		}
		
		s = y;
		System.out.println(s);
		
	}

}
