package unit3;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Scanner;

public class Distance {
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{

		System.out.println("Enter x1 y1 x2 and y2 in that order");


	}

	public void Distance(int x1, int y1, int x2, int y2)
	{
	/*	Scanner keyboard = new Scanner(System.in);
		
		x1 = keyboard.nextInt();
		y1 = keyboard.nextInt();
		x2 = keyboard.nextInt();
		y2 = keyboard.nextInt();

*/
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		/*xTwo = x2;
		xOne = x1;
		yTwo = y2;
		yOne = y1;*/
x2 = xTwo;
x1 = xOne;
y2 = yTwo;
y1 = yOne;

	}

	public void calcDistance()
	{
Scanner keyboard = new Scanner(System.in);
		
		int x1 = keyboard.nextInt();
		int y1 = keyboard.nextInt();
		int x2 = keyboard.nextInt();
		int y2 = keyboard.nextInt();
distance = sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 

	}

	public void print( )
	{
System.out.println("distance == " + distance);


	}
	
	public static void main(String[] args) {
		Distance x = new Distance();
		x.Distance(1,1,8,1);
		x.setCoordinates(1,1,3,1);
		x.calcDistance();
		x.print();
		
	}
}
