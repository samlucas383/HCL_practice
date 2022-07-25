package day5; 


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class checkedException{
	public static void main(String[] args) throws FileNotFoundException {
		int x = 30; 
		int y = 0; 
		File file = new File("C:\\Users\\sam.lucas\\eclipse-workspace\\practice\\src\\test\\java");
		
		
		// arithmetic exception 
		System.out.println(x/y);
		
		
		// file not found exception
		BufferedReader file_br = new BufferedReader(new FileReader(file)); 
	}
}


