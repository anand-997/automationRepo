
public class LargestArray {

	public static void main(String[] args) {
		int a [] = {32,8,78,96,45};
		int max = a [0];
		
		for (int i = 0; i <a.length; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println(max + " is the largest number of array");
	}
}
