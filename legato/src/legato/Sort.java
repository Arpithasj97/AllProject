package legato;

public class Sort 
{

		  
	 
	    static void sorting(String arr[], int n)
	    { 
	        int index[] = new int[n]; 
	        int i, j, min; 
	  
	       
	       
	        for (i = 0; i < n; i++) { 
	            index[i] = i; 
	        } 
	  
	           
	        for (i = 0; i < n - 1; i++) { 
	            min = i; 
	            for (j = i + 1; j < n; j++) { 
	               
	                if (arr[index[min]].compareTo(arr[index[j]]) > 0) { 
	                    min = j; 
	                } 
	            } 
	  
	            
	            if (min != i) { 
	                int temp = index[min]; 
	                index[min] = index[i]; 
	                index[i] = temp; 
	            } 
	        } 
	  
	       
	        for (i = 0; i < n; i++) { 
	            System.out.print(arr[index[i]] + " "); 
	        } 
	    } 
	  
	  
	    static public void main(String[] args) { 
	        String arr[] = {"ckm", "bnglr", "hsn", "kdr"}; 
	        int n = 4; 
	        sorting(arr, n); 
	    } 
	} 

