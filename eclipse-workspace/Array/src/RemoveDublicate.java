
public class RemoveDublicate {
	  	        
	    public static void main(String[] args)
	    {	// wrong program
	        int a [] = {1,2,2,3,1,4};
	        int temp [] = new int [a.length];
	        int j = 0;
	        
	        for (int i = 0; i < a.length-1; i++)
	        {
	        	if (a[i] != a[i + 1])
	        	{
	        		temp [j++] = a[i]; 
	        	}
	        }
	        temp [j++] = a[a.length-1];
	        
	        for (int k = 0; k < temp.length; k++)
	        {
	        	System.out.println(temp[k] + ",");
	        }
	        
	    }

}
