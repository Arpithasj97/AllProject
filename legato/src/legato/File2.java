	package legato;

	import java.io.*;

	public class File2
	{
		public static void main(String[]  args) {

			FileReader fis=null;
			FileWriter fos=null;
			
			
	    try {
	            fis=new 	FileReader("C:\\legato/abc.txt");
	    	     fos=new    FileWriter("file.txt");
	    
	    	int i;
	    	while((i=(fis.read()))!=-1) {
	    		
	    	
	    		System.out.println((char)i);
		
	    		fos.write((char)i);
	    	}
	    }catch (IOException e) 
	    {
	    	e.printStackTrace();
	    }
	  finally {
		  if(fis!=null)
			  try
		  {
				  fis.close();
				  
		  }
		  catch(IOException e) 
	    {
	    	e.printStackTrace();
	         }
	    
	  if(fos!=null)
		  try {
			  fos.close();
		  }
	  catch(IOException e) 
	    {
	    	e.printStackTrace();
		  }
	}


		}
	}
