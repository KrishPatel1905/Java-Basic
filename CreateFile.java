

import java.io.*;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		try
		{
		   File myObj = new File("E:\\2. CE251 Java Programming\\1. 2025 Java\\FileHandling\\Mayuri.txt");


		  
		   if(myObj.createNewFile())
		   {
			   System.out.println("File Created : " + myObj.getName());
		
		   }
		   else
		   {
			   System.out.println("File Already exists.");
		   }
		}
		catch(IOException e)
		{
			System.out.println("An error occurred. ");
			e.printStackTrace();
		}
		
	}
}
