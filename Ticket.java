package stadium;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map.Entry;


public class Ticket {

	public int totalCost;
	static ArrayList<Integer> qCost = new ArrayList<Integer>();
	
	public void cricketStadiumSelection() {
		
		int cricketStadiumCost = 0;
		String cricketStadiumChoice = "";
		
		System.out.println("\nFollowing are the available types of stadium along with their price: ");
		StadiumMap.printCricketMap();
		
		Scanner sc = new Scanner(System.in);
		
		boolean cricketChoicevalidation = false;
		while(!cricketChoicevalidation) {
			System.out.println("\nPlease enter your choice of cricket stadium: ");
			cricketStadiumChoice = sc.nextLine();
			
			if(StadiumMap.getCricketMap().containsKey(cricketStadiumChoice)) {
				cricketStadiumCost = StadiumMap.getCricketMap().get(cricketStadiumChoice);
				cricketChoicevalidation = true;
			}
			else {
				cricketChoicevalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + cricketStadiumCost;
		System.out.println("\nCrust chosen: " + cricketStadiumChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
	public void matchesSelection() {
		
		int matchesCost = 0;
		String matchesChoice = "";
		
		System.out.println("\nFollowing are the available choice of matches along with their price: ");
		StadiumMap.printMatchesMap();
		
		Scanner sc = new Scanner(System.in);
		
		boolean matchesChoicevalidation = false;
		while(!matchesChoicevalidation) {
			System.out.println("\nPlease enter your choice of matches: ");
			matchesChoice = sc.nextLine();
			
			if(StadiumMap.getMatchesMap().containsKey(matchesChoice)) {
				matchesCost = StadiumMap.getMatchesMap().get(matchesChoice);
				matchesChoicevalidation = true;
			}
			else {
				matchesChoicevalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + matchesCost;
		System.out.println("\nCheese chosen: " + matchesChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	public void quantityOfTicket() {
		System.out.println("\nHow many of these tickets would you require: ");
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt();
		totalCost = totalCost * choice;
	
		if(choice == 1) {
			System.out.println("\nYou have opted for " + choice + " ticket of this type");
		}
		else {
			System.out.println("\nYou have opted for " + choice + " ticket of this type");
		}
		System.out.println("\nThe cost of the ticket is: " + totalCost);
		qCost.add(totalCost);
	}
	public int overallCost() {
		int overallCost = 0;
		int i;
		
		for (i = 0; i < qCost.size(); i++) {
			overallCost +=  qCost.get(i);
		}
             
		return overallCost;
	}

}
