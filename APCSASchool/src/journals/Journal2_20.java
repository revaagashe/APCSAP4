package journals;
import java.util.Scanner;

public class Journal2_20 {
	public static void main(MyString1 args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a decimal integer between 0 and 255");
		int numD = keyboard.nextInt();
		int numB1; int numB2; int numB3; int numB4; int numB5; int numB6; int numB7; int numB8;
		if(numD>=128){
			 numB1 = 1;
		}
		else 
			 numB1 = 0;

		if (numD%128>=64) {
			 numB2 = 1;
		}
		else 
			 numB2 = 0;

		if ((numD%128)%64 >=32) {
			 numB3 = 1;
		}
		else 
			numB3 = 0;

		if ((((numD%128)%64)%32) >=16) {
			 numB4 = 1;
		}
		else 
			numB4 = 0;

		if ((((numD%128)%64)%32)%16 >=8) {
			numB5 = 1;
		}
		else 
			numB5 = 0;

		if (((((numD%128)%64)%32)%16)%8 >=4) {
			 numB6 = 1;
		}
		else 
			numB6 = 0;

		if ((((((numD%128)%64)%32)%16)%8)%4 >=2) {
			 numB7 = 1;
		}
		else 
			numB7 = 0;

		if (((((((numD%128)%64)%32)%16)%8)%4)%2 >=1) {
			 numB8 = 1;
		}
		else 
			numB8 = 0;
System.out.print(numB1);
System.out.print(numB2);
System.out.print(numB3);
System.out.print(numB4);
System.out.print(numB5);
System.out.print(numB6);
System.out.print(numB7);
System.out.print(numB8);
}

}