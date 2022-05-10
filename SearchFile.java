
import java.io.*;
import java.util.Scanner;

public class SearchFile {
	
	public void search() {
	File dir = new File("C:\\Users\\ssoma\\eclipse-workspace\\LockedMe\\Files");
	Scanner sc = new Scanner(System.in);
	String filename;
	System.out.println("Enter Filename to search: ");
	filename = sc.next();
	
	File file = new File(dir, filename);
	if(file.exists())
	System.out.println("File Found " + file.getName());
	else {
		System.out.println("File not Found: " + filename);
	}
	
}
	
	}
