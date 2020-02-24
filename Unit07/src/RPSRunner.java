//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String player = "";
		RockPaperScissors game = new RockPaperScissors();
		
		while(true) {		
			System.out.print("Type in your prompt [R,P,S] :: ");
			player = keyboard.next();
			game.setPlayers(player);
			System.out.println(game);
		}
	}
}



