package legato;
import java.util.ArrayList;
import java.util.List;
public class Reverse {
	
	    public static void main(String args[]) {


	        List<String> place = new ArrayList<>();
	        place.add("blr");
	        place.add("Shmg");
	        place.add("Dvg");
	        place.add("ckm");
	        place.add("ask");
	        place.add("hsn");
	        place.add("mnglr");

	        System.out.println("Original ArrayList: " + place);

	  
	        int size = place.size();
	        for (int i = 0; i < size / 2; i++)
	        {
	            final String district = place.get(i);
	            place.set(i, place.get(size - i - 1)); 
	            place.set(size - i - 1, district); 
	        }

	        System.out.println("Reversed ArrayList: " + place);
	    }

	}


