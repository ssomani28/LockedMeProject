import java.util.Scanner;

public class LockedMeMain {
public static void main(String[] args) {
	int choice = 0;
	Scanner sc = new Scanner(System.in);
	
	do {
		displayMenu();
		System.out.println("Enter your Choice: ");
		choice = sc.nextInt();
		
		switch (choice) {
		
		case 1: CreateFile create = new CreateFile();
		create.createFile();
		break;
		
		case 2: FileDelete delete = new FileDelete();
		delete.fileDelete();
		break;
		case 3: SearchFile search = new SearchFile();
		search.search();
		break;
		case 4: Sorting sort = new Sorting();
		sort.sort();
		break;
		case 5: System.out.println("********************************************");
		System.out.println("Thanks for Using LockedMe.com");
		System.out.println("Exited Successfully"); 
		System.out.println("*********************************************");
		System.exit(0);
		break;

		default: System.out.println("Invalid Choice");
			break;
		}
	}
	while (choice>0);
		sc.close();
}
private static void displayMenu() {
	System.out.println("**********************************************************");
	System.out.println("\t\tWelcome to LockedMe.com");
	System.out.println("**********************************************************");
	System.out.println("\t\t Developed By : Mr. Siddhant Somani   Batch: MS FSD Apr 2022 cohort 3");
	System.out.println("\t\t1. Create New File");
	System.out.println("\t\t2. Delete a File");
	System.out.println("\t\t3. Search a File");
	System.out.println("\t\t4. Sort All Files");
	System.out.println("\t\t5. Exit");
	
}
}
