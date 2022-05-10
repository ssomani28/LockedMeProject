import java.io.File;
import java.util.Scanner;

public class FileDelete {
	
	public void fileDelete() {
		String dir = ("C:\\Users\\ssoma\\eclipse-workspace\\LockedMe\\Files");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Filename to del: ");
		String filename = sc.next();
		
		File folder = new File(dir, filename);
		
		if (folder.delete()) {
			System.out.println("Deleted the File: " + filename);
			
			
		}else {
			System.out.println("File not Found");
		}		
	}

}
