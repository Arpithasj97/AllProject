package legato;

public class Numchar {
	  public static void main(String[] args) {
		    String s="arpitha sj abhishek";
		   // int count = 0 ;

		    for (int i = 0; i <=s.length()-1; i++) {
		    	 int count = 0 ;
		        for (int j = 0; j < s.length(); j++) {
		        	
		            if(s.charAt(i)==s.charAt(j))
		            {
		                count++;

		            }
		        }   
		        if(s.charAt(i)!=' ') {
		        
		        System.out.println(s.charAt(i)+"  "+count);
		        }
		      //  String d=String.valueOf(s.charAt(i)).trim();
		     //   s=s.replaceAll(d,"");
		       // count = 0;

		    }

		}
		

}