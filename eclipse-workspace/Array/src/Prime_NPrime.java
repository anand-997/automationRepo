
public class Prime_NPrime {
	public static void main (String[] args)
	{
		 int a[]= {1,2,3,4,5,6,7,8,9,10} ;
		 
		 for(int i=0; i<a.length; i++)
		 {		                           
		        for(int j=0; j<a.length; j++)
		        {
		        	boolean isPrime = true;                                          
		        	for (int k=2; k<i; k++)
		        	{

		        		if(i%j==0)
		        		{
		        			isPrime = false;
		        			break;
		        		}
		        	} 
		        	if(isPrime)
		        	{
		        		System.out.println(i + "prime numbers from array ");
		        	}
		        }
		    }
	    }

}
