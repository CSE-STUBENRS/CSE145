//Sean Stubenrauch
import java.util.Scanner;
import java.util.Random;
public class Homework03 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		Random random = new Random();
		//random needed to randomize computer choice
		boolean playAgain = true;
		
		while(playAgain) {	
		
		//starting the scores at 0
		int playerScore = 0;
		int computerScore = 0;
		
		while (playerScore <3 && computerScore <3) //will run as long as the players score is below 2
		{
			System.out.println("Select a move (Rock/Paper/Scissors)!");
			String playerMove = key.nextLine();
			
			int randomChoice = random.nextInt(3); //random choice between rock, paper, or scissors
			
			String computerMove = null; //debugger suggested null
			if (randomChoice == 0)
			{
				computerMove = "Scissors";
			}
			else if (randomChoice == 1)
			{
				computerMove = "Paper";
			}
			else if (randomChoice == 2)
			{
				computerMove = "Rock";
			}
			
			System.out.println("Computer has selected "+computerMove+"!");
			
			//below are all the if statements for the outcomes
		 if (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Paper"))  
		 	{
		        System.out.println("It's a draw!");
		    } 
		 else if (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Rock"))  
		 	{
		        System.out.println("It's a draw!");
		    } 
		 else if (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Scissors"))  
		 	{
		        System.out.println("It's a draw!");
		    } 
		 else if (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) 
		 	{
		        System.out.println("Player gets a point!");
		        playerScore++;
		 	} 
		 else if (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock"))
		 	{
			 	System.out.println("Player gets a point!");
			 	playerScore++;
		 	}
		 else if (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))
		 	{
			 	System.out.println("Player gets a point!");
			 	playerScore++;
		 	}
		 else if (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Rock"))
		 	{
			 	System.out.println("Computer gets a point!");
			 	computerScore++;
		 	}
		 else if (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Paper"))
		 	{
			 	System.out.println("Computer gets a point!");
			 	computerScore++;
		 	}
		 else if (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Scissors"))
		 	{
			 	System.out.println("Computer gets a point!");
			 	computerScore++;
		 	}
		 else
		 	{
			 System.out.println("Invalid input, computer gets a point!");
		 	}
			
		}
		 
		//the final outcomes if the score is greater than 2, the player/computer wins
		if (playerScore == 3)
		{
			System.out.println("Player wins!");
		}
		else if (computerScore == 3)
		{
			System.out.println("Computer wins! :(");
		}
		
		System.out.println("Would you like to play again (Yes/No)");
		String response = key.nextLine();
		
		if (response.equalsIgnoreCase("No"))
		{
			System.out.println("Thanks for playing!");
			System.exit(0);
		}
		
	
		}	
	}

}

