package String_program;

public class Remove_SChar {
	public static void main(String[] args) {
		
		String a = "&€*a@n#a%n$d";
		
		String b = "";
		for (int i = 0; i<a.length(); i++)
		{
			if (a.charAt(i)>65 && a.charAt(i)<=122)
			{
				b = b + a.charAt(i);
			}
		}
		System.out.println(b);
		
	}

}
