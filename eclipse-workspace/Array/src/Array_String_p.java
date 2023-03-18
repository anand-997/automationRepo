
public class Array_String_p {
	
	public static void main(String[] args) {
		
		int a [] = {12,21,65,58};
		char b [] = {'a','b','c'};
		
		int size = a.length;
		int sizeb = b.length;
		System.out.println("size of array a = " + size);
		System.out.println("size of array b = " + sizeb);
		System.out.println(a[3]);
		a[3] = 100;
		System.out.println(a[3]);
		System.out.println(b[1]);
		
		
		int c [] = new int [4];
		c [0] = 55;
		c [1] = 21;
		c [2] = 87;
		c [3] = 78;
		//c [4] = 32;
		
		
		System.out.println(c [2]);
		String s [] = new String [5];
		s [0] = "my";
		s [1] = " dear";
		s [2] = " rani";
		s [3] = " i love u, and"; 
		s [4] = " also i love mom and dad";
		System.out.println(s[0]+s[1]+s[2]+s[3]+s[4]);
		
		for (int i = 0 ; i < a.length; i++)
		{
			System.out.print( c[i] + ",");
		}
	}
}
