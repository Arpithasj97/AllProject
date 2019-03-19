package legato;

import java.io.*;

public class File
{
	public static void main(String[]  args) {

    try {
    	FileInputStream fis=new 	FileInputStream("C:\\legato/abc.txt");
    	FileOutputStream fos=new    FileOutputStream("file.txt");
    
    	int i;
    	while((i=(fis.read()))!=-1) {
    		
    	
    		System.out.println((char)i);
	
    		fos.write((char)i);
    	}
    }catch (IOException e) 
    {
    	e.printStackTrace();
    }
  
         }
    
  
}

