
public class ArrayPractice {
	
		
		public static void main(String[] args) {
			// for ascending and descending array
			int a [] = {15,21,58,24,54,69};
			
			for (int i = 0; i < a.length; i++) // line
			{
				for (int j = a.length - 1; j < i + 1; j++) // Comparison
				{
					int temp;
					if (a[i]<a[j])
					{
						temp = a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
			}
			for (int k = 0; k < a.length; k++)
			{
				System.out.println(a[k]);
			}
		}

	
}
