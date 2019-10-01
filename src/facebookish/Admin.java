package facebookish;
import java.util.Scanner;
import java.util.ArrayList;
public class Admin extends Editor{

	UserFactory myFactory = new UserFactory();

	public Admin(String email, String userName) {
		super(email, userName);
	}
	
	public boolean disableUser(User u) {
		return true;
	}
	public User addUser() {
		Scanner myScanner = new Scanner(System.in);
		ArrayList<String> myArgs = new ArrayList<>();
		System.out.println("Enter Type of User C/E/A");
		if (myScanner.hasNextLine()) {
			myArgs.add(myScanner.nextLine());
		}
		System.out.println("Enter email");
		if (myScanner.hasNextLine()) {
			myArgs.add(myScanner.nextLine());
		}
		System.out.println("Enter username");
		if (myScanner.hasNextLine()) {
			myArgs.add(myScanner.nextLine());
		}
		return myFactory.makeNewUser(myArgs);
	}
	
}
