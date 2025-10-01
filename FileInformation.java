

import java.io.File;
import java.util.*;

public class FileInformation {

	public static void main(String[] args) {
		
		//String so = new String();
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Path name: ");
		//so = sc.nextLine();
		File myObj = new File("E:\\2. CE251 Java Programming\\1. 2025 Java\\FileHandling\\chaitya.txt");	
      
		if(myObj.exists())
         {
        	 System.out.println("File Name : " + myObj.getName());
        	 System.out.println("Absolute Path: " + myObj.getAbsolutePath());
        	 System.out.println("Writable " + myObj.canWrite());
        	 System.out.println("Readable " + myObj.canRead());
        	 System.out.println("File size in bytes: " + myObj.length());
         }
         else
         {
        	 System.out.println("File does not exists");
         }
	}
}
