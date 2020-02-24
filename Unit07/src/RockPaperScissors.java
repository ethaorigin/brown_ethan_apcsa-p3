//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		double compCalc = Math.random();
		if (compCalc <=.33333) {
			compChoice = "R";
		}else if(compCalc > .33333 && compCalc <= .66666){
			compChoice = "P";
		}else{
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner = "";
			if((playChoice.equals("R") && compChoice.equals("S")) || (playChoice.equals("P") && compChoice.equals("R")) || (playChoice.equals("S") && compChoice.equals("P"))) {
				winner = "player";
			}else if(playChoice.equals(compChoice)) {
				winner = "draw";
			}else {
				winner = "computer";
			}
		return winner;
	}

	public String toString()
	{
		String output="";
		if(determineWinner().equals("draw")) {
			output = "The computer had " + compChoice + " too. The game is a draw.";
		}else {
			output = "The computer had " + compChoice + ". The " + determineWinner() + " won.";
		}
		return output;
	}
}