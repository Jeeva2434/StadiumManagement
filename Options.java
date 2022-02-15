package stadium;

import java.io.IOException;
import java.util.Scanner;

public class Options {
	public void homeScreen() throws IOException {
		System.out.println("Choose whether you are an user or admin");
		System.out.println("1. Audience");
		System.out.println("2. Admin");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			User user = new User();
			user.stadium();
			break;
		case 2:
			Admin admin = new Admin();
			admin.adminPanel();
			break;
		}
	}
}