package legato;

public class Words
{
		public static void main(String args[])
		{ 
			String s = "arpitha a abhi dad mom";
	 
			int count = 1;
	 
			for (int i = 0; i < s.length() - 1; i++)
			{
				if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
				{
					count++;
	 
				}
			}
	 		System.out.println("Number of words in a string = " + count);
		}
	}

