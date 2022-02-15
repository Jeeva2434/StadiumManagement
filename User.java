package stadium;

import java.util.Scanner;

public class User {
	public Ticket ticket;
	
	public void stadium() {
		
		boolean ticketOrderIteration = true;
		
		
		while(ticketOrderIteration) {
			System.out.println("\nWant to buy ticket");
			System.out.println("1. yes");
			
			
			Scanner obj = new Scanner(System.in);
			int choice = obj.nextInt();
			
			switch(choice) {
				case 1:
					ticket = new Ticket();
					ticket.cricketStadiumSelection();
					ticket.matchesSelection();
					ticket.quantityOfTicket();
					System.out.println("\nWould you like to buy more tickets");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					Scanner obj2 = new Scanner(System.in);
					int choice2 = obj.nextInt();
					
					if(choice2 == 1) {
						ticketOrderIteration = true;
					}
					else {
						System.out.println("\nThanks for buying ticket !!!");
						System.out.println("The overall cost of ticket is " + ticket.overallCost());
						ticketOrderIteration = false;
					}
					break;
		}		
	 }
   }
}