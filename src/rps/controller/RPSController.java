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
				
			}
		}
	}
}
