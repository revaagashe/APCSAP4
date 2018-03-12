package unit3;
import java.util.Scanner;

import unit2.Physics;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
System.out.println("Enter a b and c");

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		Scanner keyboard = new Scanner(System.in);
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		c = keyboard.nextInt();

 	}

	public void calcRoots( )
	{
 rootOne = -b+(sqrt((b*b)-(4*a*c))/(2*a));
 rootTwo = -b-(sqrt((b*b)-(4*a*c))/(2*a));

	}

	public void print( )
	{
System.out.println("root one :: " + rootOne);
System.out.println("root two :: " + rootTwo);

	}
	
	public static void main(String[] args) {
		Quadratic x = new Quadratic();
		x.setEquation(6,3,2);
		x.calcRoots();
		x.print();
	
		
	}
}