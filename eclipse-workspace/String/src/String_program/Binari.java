package String_program;

public class Binari {
public static void main(String[] args) {
		
		String a = "01100110100";
		
		String [] b = a.split("0");
		String c [] = a.split("1");
					
		StringBuffer d = new StringBuffer();
		for(int i = 0; i < b.length; i++) {
		    d.append(b[i]);
		}
		String a1 = d.toString();
		System.out.println(a1);
		      
		StringBuffer f = new StringBuffer();
		for(int i = 0; i < c.length; i++) {
			f.append(c[i]);
		}
		String b1 = f.toString();
		System.out.println(b1);
	}

}
