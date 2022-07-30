package filehandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//reading the text file using scanner class
public class ReadFile {
	public void read() {
		try { 
			//Pass the path to the file as a parameter
	          
	        File f1 = new File("F:\\newfile.txt");    
	        Scanner userdataReader = new Scanner(f1);  
	        // reading each line of the file
	        while (userdataReader.hasNextLine()) {  
	            String fileData = userdataReader.nextLine();  
	            System.out.println(fileData);  
	        }  
	        userdataReader.close();  
	    } catch (FileNotFoundException exception) {  
	        System.out.println("Unexcpected error occurred-Error in the read file");  
	        exception.printStackTrace();
	        //print the throwable and its backtrace in  the standard error stream 
	    }  
	}
	  
	
}  



