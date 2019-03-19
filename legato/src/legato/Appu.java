package legato;
import java.util.*;
public class Appu {
   public static void main(String[] args) {
	   String s=" welcome to legato 22";
	   int count=0;
	    for(int i=0;i<=s.length()-1;i++) {
	    	if(s.charAt(i)!=' ') {
	    		count++;
	    		
	    	}
	    }
	    System.out.println(count);
   }
}
