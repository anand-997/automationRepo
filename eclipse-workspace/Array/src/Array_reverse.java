
public class Array_reverse {
	
	public static void main(String[] args) {
		
		int a [] = {12,54,85,89,23};
		// reverse 23,89,85,54,12
		
		int size = a.length;
		//System.out.println(size);
		
		for (int i = 0; i < size; i++)
		{
			System.out.print(a[i] + ",");
		}
		System.out.println();
		for (int i = size-1; i >= 0; i--)
		{
			System.out.print(a[i] + ",");
		}
		System.out.println();
		System.out.println(a[0]);
		
		int b [] = new int [size];  // temparary array for a reverse array
		
		for (int x = 0; x < size; x++ )
		{
			b[x]= a [(size-1)-x]; 
			System.out.print(b[x] + ",");
		}
		System.out.println();
		a=b;
		for (int i = 0; i < size; i++)
		{
			System.out.print(a[i] + ",");
		}
		
	
	}

}
