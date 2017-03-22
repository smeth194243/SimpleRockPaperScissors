package rps.model;

import rps.controller.RPSController;

public class RPSModel 
{
	public int getRandomInt()
	{
		int computerChoice = 0; 
		computerChoice = (int)(Math.random()*3);
		return computerChoice;
	}
}
