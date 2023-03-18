package String_program;

public class NarendraModi {
	
	public static void main(String[] args) {
		
		String a = "NarendraModi";
		
		String b = a.replace("NarendraModi", "Narendra Modi");
		
		String c [] = b.split(" ");
		
		for (int i= 0; i < c.length; i++)
		{
			System.out.println(c[i]);
		}

	}
}
