import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateFile {

	public void createFile() {
			
			Scanner sc = new Scanner(System.in);
			
			String dir = ("C:\\Users\\ssoma\\eclipse-workspace\\LockedMe\\Files");
			String filename;
			System.out.println("Enter the File Name: ");
			filename = sc.next();
		
			File file = new File(dir,filename);
			
			try {
				if(file.createNewFile()){
					System.out.println("File Created: " + file.getName());
						
				}else {
					System.out.println("File Already Exists");
					
				}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				sc.close();
			}
			
		}
	
	}