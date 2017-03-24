package rps.controller;

import rps.model.RPSModel;
import java.util.Scanner;

public class RPSController 
{
	private Scanner input;
	private String userInput;
	private RPSModel computerChoice;
	private int randomInt;
	
	public RPSController()
	{
		
	}
	
	public void start()
	{
		computerChoice = new RPSModel();
		
		System.out.println("Lets play Rock Paper Scissors!");
		System.out.println("Type 1 for Rock, 2 for Paper, 3 for Scissors.");
		
		input = new Scanner(System.in);
		String userInput = input.nextLine();
		
		if(userInput.equals("1") ||userInput.equals("2") || userInput.equals("3"))
		{
			randomInt = computerChoice.getRandomInt();
			
			if(randomInt == 3)
			{
				if(userInput.equals("1"))
				{
					System.out.println("You chose Rock, and I chose Scissors. You win!");
				}
				
				if(userInput.equals("2"))
				{
					System.out.println("You chose Paper, and I chose Scissors. I win!");
				}
				
				if(userInput.equals("3"))
				{
					System.out.println("You chose Scissors, and I chose Scissors. Swordfight!");
				}
			}
			
			if(randomInt == 2)
			{
				if(userInput.equals("1"))
				{
					System.out.println("You chose Rock, and I chose Paper. I win!");
				}
				
				if(userInput.equals("2"))
				{
					System.out.println("You chose Paper, and I chose Paper. Great minds think alike!");
				}
				
				if(userInput.equals("3"))
				{
					System.out.println("You chose Scissors, and I chose Paper. Swordfight!");
				}
			}
			
			if(randomInt == 1)
			{
				if(userInput.equals("1"))
				{
					System.out.println("You chose Rock, and I chose Rock. Pebbles!");
				}
				
				if(userInput.equals("2"))
				{
					System.out.println("You chose Paper, and I chose Rock. You win!");
				}
				
				if(userInput.equals("3"))
				{
					System.out.println("You chose Scissors, and I chose Rock. I win!");
				}
			}
			
			System.out.println("Play again?\nYes or No");
			
			//String userInput2 = input.nextLine();
			userInput = input.nextLine();
			if(userInput.equalsIgnoreCase("Yes"))
			{
				start();
			}
			else
			{
				System.exit(0);
			}
		}
	}
}
