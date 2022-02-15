package stadium;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Admin {
	public void adminPanel() throws IOException {
		System.out.println("\n");
		System.out.println("1. View Stadium and ticket price");
		System.out.println("2. Change the price of ticket");
		System.out.println("3. Add Stadium for Events");
		System.out.println("4. Delete Stadium");
		System.out.println("5. Logout");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			viewStadiumsAndPrice();
			break;
		case 2:
			StadiumsPriceChange();
			break;	
		case 3:
			StadiumsAddition();
			break;
		case 4:
			StadiumsDeletion();
			break;
		case 5:
			Options option = new Options();
			option.homeScreen();
			break;
		}		
	}
	

	public void StadiumsPriceChange() throws IOException {
		System.out.println("\nSelect the Stadiums for which the price is to be changed");
		System.out.println("1. Cricket");
		System.out.println("2. Matches");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case 1:
			String cricketKey = "";
			int newCricketCost = 0;
			
			StadiumMap.printCricketMap();
			
			System.out.println("\nEnter the Cricket Stadium for which the price should be modified: ");
			cricketKey = br.readLine();
			System.out.println("Enter the new price: ");
			newCricketCost = Integer.parseInt(br.readLine());
			StadiumMap.cricketMap.replace(cricketKey, newCricketCost);
			System.out.println("\nThe modified cost of " + cricketKey + " is " + StadiumMap.getCricketMap().get(cricketKey));
			adminPanel();
			break;
		case 2:
			String matchesKey = "";
			int newMatchesCost = 0;
			
			StadiumMap.printMatchesMap();
			
			System.out.println("\nEnter the Matches for which the price should be modified: ");
			matchesKey = br.readLine();
			System.out.println("Enter the new price: ");
			newMatchesCost = Integer.parseInt(br.readLine());
			StadiumMap.matchesMap.replace(matchesKey, newMatchesCost);
			System.out.println("\nThe modified cost of " + matchesKey + " is " + StadiumMap.getMatchesMap().get(matchesKey));
			adminPanel();
			break;
		}		
	}
	
	public void StadiumsAddition() throws IOException {
		System.out.println("Select the to Stadium which addition is to made");
		System.out.println("1. Cricket");
		System.out.println("2. Matches");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case 1:
			String cricketKey = "";
			int newCricketCost = 0;
			
			StadiumMap.printCricketMap();
			
			System.out.println("\nEnter the new Stadium name : ");
			cricketKey = br.readLine();
			System.out.println("Enter the price for new Stadium : ");
			newCricketCost = Integer.parseInt(br.readLine());
			StadiumMap.cricketMap.put(cricketKey, newCricketCost);
			System.out.println("\nThe stadium " + cricketKey + " has been added with the price of " + StadiumMap.getCricketMap().get(cricketKey));
			adminPanel();
			break;
		case 2:
			String matchesKey = "";
			int newMatchesCost = 0;
			
			StadiumMap.printMatchesMap();
			
			System.out.println("\nEnter the new Matches : ");
			matchesKey = br.readLine();
			System.out.println("Enter the new price: ");
			newMatchesCost = Integer.parseInt(br.readLine());
			StadiumMap.matchesMap.put(matchesKey, newMatchesCost);
			System.out.println("\nThe Match type " + matchesKey + " has been added with the price of " + StadiumMap.getMatchesMap().get(matchesKey));
			adminPanel();
			break;
		}		
	}
	
	public void StadiumsDeletion() throws IOException {
		System.out.println("Select the stadium from which deletion has to be done");
		System.out.println("1. Cricket");
		System.out.println("2. Matches");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case 1:
			String cricketKey = "";
			
			StadiumMap.printCricketMap();
			
			System.out.println("\nEnter the stadium type to be deleted: ");
			cricketKey = br.readLine();
			StadiumMap.cricketMap.remove(cricketKey);
			System.out.println("\nThe stadium type " + cricketKey + " has been deleted");
			adminPanel();
			break;
		case 2:
			String matchesKey = "";
			
			StadiumMap.printMatchesMap();
			
			System.out.println("\nEnter the matches to be deleted: ");
			matchesKey = br.readLine();
			StadiumMap.matchesMap.remove(matchesKey);
			System.out.println("\nThe Matches type " + matchesKey + " has been deleted");
			adminPanel();
			break;
		}		
	}
	
	
	public void viewStadiumsAndPrice() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nSelect the Stadium to be viewed");
		System.out.println("1. Cricket");
		System.out.println("2. Matches");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			StadiumMap.printCricketMap();
			adminPanel();
			break;
		case 2:
			StadiumMap.printMatchesMap();
			adminPanel();
			break;
		}
	}
}
