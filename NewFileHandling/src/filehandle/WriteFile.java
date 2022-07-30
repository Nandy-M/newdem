package filehandle;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public void write() {
		String message="I am NandhiniMurugesan.I hale from Cuddalore.";
	      
	    try {  
	    	//create a filewriter object
	        FileWriter fwrite = new FileWriter("F:\\newfile.txt");
	        //Write the content to the file using write()
	        fwrite.write(message);   
	   
	        // Closing the stream  
	        fwrite.close();   
	        System.out.println("Content is successfully wrote to the file.");  
	    } 
	    catch (IOException e) {  
	        System.out.println("Unexpected error occurred-File is not Created");  
	        e.printStackTrace();  
	        }  
		
	}
	  
 }  


