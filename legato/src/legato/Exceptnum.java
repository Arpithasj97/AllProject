package legato;
 
public class Exceptnum{
	public static void main(String[] args) {
		String s="welcome to legato 12";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}
}