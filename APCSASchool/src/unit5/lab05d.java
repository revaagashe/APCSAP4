package unit5;

import java.util.Scanner;

public class lab05d {
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		System.out.println(test);   //A

		//add more test cases
		
		
		
		
		
		
		
		

	}
}
