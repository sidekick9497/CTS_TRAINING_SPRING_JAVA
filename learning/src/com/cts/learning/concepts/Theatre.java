package com.cts.learning.concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Theatre {
	//private int totalCost;
	private int silver = 5;
	private int gold = 5;
	private int platinum = 3;
	private int diamond = 2;
	private int numberOfTickets;
	private TheatreTier tickets[];
	public void bookTickets() throws InputMismatchException
	{
		System.out.println("Number of Tickets needed");
		Scanner scanner = new Scanner(System.in);
		numberOfTickets = scanner.nextInt();
		tickets         = new TheatreTier[numberOfTickets];
		int counter     =0 ;
		
		int option;
		while(counter != numberOfTickets)
		{
			System.out.println("Tiers to choose from \n 1.silver(available:" + silver+ ")"+  "\n 2.gold(available: "+gold+")" +"\n 3.platinum(available: " +platinum +")" + " \n 4.diamond(available : "+diamond+ ") \n");                           
			option = scanner.nextInt();
			switch(option)
			{
				case 1:
					if(available(silver))
					{
						tickets[counter] = TheatreTier.SILVER;
						counter++;
						silver--;
						break;}
				case 2:
					if(available(gold))
					{
						tickets[counter]  = TheatreTier.GOLD;
						counter++;
						gold--;
						break;
					}
				case 3:
					if(available(platinum))
					{
						tickets[counter] = TheatreTier.PLATINUM;
						platinum--;
						counter++;
						break;
					}
				case 4:
					if(available(diamond))
					{
						tickets[counter] = TheatreTier.DIAMOND;
						diamond--;
						counter++;
						break;
					}
				default:
					System.out.println("invalid option");
					
			}
			System.out.println("current cost :" + calculateTotalCost(tickets));	
		
	}
		scanner.close();
		System.out.println("grand total :" +calculateTotalCost(tickets));
	}
	
	private int calculateTotalCost(TheatreTier[] tickets)
	{
		int total = 0;
		for(TheatreTier ticket:tickets)
		{	
			if(ticket!=null)
			{
			//System.out.println(ticket.getCost());
			total += ticket.getCost();
		    }
		}
		return total;
	}
	
	private boolean available(int tier)
	{
		if(tier >0)
		{
			return true;
		}
		System.out.println("sorry, tickets not available for that tier");
		return false;
	}
	
}
