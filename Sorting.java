import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

    public class Sorting {

    	public void sort() {
			
        		File folder = new File("C:\\Users\\ssoma\\eclipse-workspace\\LockedMe\\Files");
        		File[] list = folder.listFiles();

        		Arrays.sort(list);
        		for(File file:list)
        			System.out.println(file.getName()+ " ");
       }
    	
	}
    	        
    