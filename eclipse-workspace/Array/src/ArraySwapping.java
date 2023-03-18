
public class ArraySwapping {
	
	public static void main(String[] args) {
		
		int a [] = {15,24,33,42};
		int b [] = {32,58,65,74};
		int c [] = new int [a.length];
		c=a;
		a=b;
		b=c;
		//System.out.println(b[1]);
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		////////////////////////////////////////////////////
		int i [] = {15,24,33,42};
		int j [] = {32,58,65,74};
		
		i[0] = j[0];
		i[1] = j[1];
		i[2] = j[2];
		i[3] = j[3];
				
		for (int z = 0; z < i.length; z++)
		{
			System.out.print(i[z] + ",");
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////
		for (int p = 0; p < i.length; p++)
		{
			int temp;
			temp = i[p];
			i [p] = j [p];
			j [p] = temp;
			
			//System.out.print(j[p]+  ",");
			System.out.print(i[p]+  ",");
			
		} 
		
		
		
		
		
	}

}
