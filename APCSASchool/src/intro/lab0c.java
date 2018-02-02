package intro;
import java.util.Scanner;

public class lab0c {
public static void main (String[] args){
	Scanner keyboard = new Scanner(System.in);
	
	int intOne, intTwo;
	double doubleOne, doubleTwo;
	float floatOne, floatTwo;
	short shortOne, shortTwo;
	
	System.out.print("Enter an integer :: ");
	intOne = keyboard.nextInt();


	System.out.print("Enter an integer :: ");
	intTwo = keyboard.nextInt();


	//add in input for all variables
	System.out.print("Enter a double :: ");
	doubleOne = keyboard.nextInt();


	System.out.print("Enter a double :: ");
	doubleTwo = keyboard.nextInt();

	System.out.print("Enter a float :: ");
	floatOne = keyboard.nextInt();


	System.out.print("Enter a float :: ");
	floatTwo = keyboard.nextInt();

	System.out.print("Enter a short :: ");
	shortOne = (short) keyboard.nextInt();


	System.out.print("Enter a short :: ");
	shortTwo = (short) keyboard.nextInt();

//print all values
	System.out.println();
	System.out.println("integer one = " + intOne );
	System.out.println("integer two = " + intTwo );
	System.out.println("double one = " + doubleOne );
	System.out.println("double two = " + doubleTwo );
	System.out.println("float one = " + floatOne );
	System.out.println("float two = " + floatTwo );
	System.out.println("short one = " + shortOne );
	System.out.println("short two = " + shortTwo );

	//print all sums
	System.out.println("integer sum = " + (intOne + intTwo)  );
	System.out.println("double sum = " + (doubleOne + doubleTwo)  );
	System.out.println("float sum = " + (floatOne + floatTwo)  );
	System.out.println("short sum = " + (shortOne + shortTwo)  );

	
}
}
