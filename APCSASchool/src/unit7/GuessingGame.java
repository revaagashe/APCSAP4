package unit7;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame()
	{	
		System.out.println("Guessing Game - how many numbers?");
		Scanner keyboard = new Scanner(System.in);
		upperBound = keyboard.nextInt();


		System.out.println("Enter a number between 1 and " + upperBound);

	}


	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);

		int guess = keyboard.nextInt();
		
		int correctNumber = (int)(Math.random()*(upperBound-1) + 1);

		int numGuesses = 0;
		if (guess == correctNumber){
			System.out.println("It took " + (numGuesses + 1) + " guesses to guess " + correctNumber);
			System.out.println("You guessed wrong " + (100*(numGuesses-1)/upperBound) + "% of the time");
		}
		do{
		if (guess>upperBound){
			System.out.println("Number out of range!");
		}
		else {
		if (guess > correctNumber){
			System.out.println("Too high! Enter a number between 1 and " + upperBound);
		}
		else {
			System.out.println("Too low! Enter  a number between 1 and " + upperBound);
		}
		}
		guess = keyboard.nextInt();
	 
		numGuesses ++;
		}while (guess != correctNumber);
		if (guess == correctNumber){
			System.out.println("\nIt took " + (numGuesses + 1) + " guesses to guess " + correctNumber);
			System.out.println("You guessed wrong " + (100*(numGuesses-1)/upperBound) + "% of the time");
			System.out.println("\n\nDo you want to play again? " );
			String answer = keyboard.next();
			if (answer == "y"){
				playGame();
			}
			
		}
	}

	public String toString()
	{
		String output="";
		return output;
	}
}