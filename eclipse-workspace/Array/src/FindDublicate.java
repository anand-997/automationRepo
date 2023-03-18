
public class FindDublicate {

	public static void main(String[] args) {
		
		int [] a = {12, 15, 11, 12, 10, 10, 18, 1};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j <a.length; j++)
			{
				if (a[i] == a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
