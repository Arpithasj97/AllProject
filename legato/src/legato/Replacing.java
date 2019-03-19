package legato;

public class Replacing
{  
public static void main(String args[])
{  
	
String str="arpitha abhi"; 
//String r1=s1.replaceAll("[a-z]","i");
//System.out.println(r1);  
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)!=' ')
{
	str=str.replace(str.charAt(i),'I');
}
	else
	{
		str=str.replace(str.charAt(i),' ');
	
}
}
System.out.println(str);

}
} 

