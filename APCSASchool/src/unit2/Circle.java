package unit2;
import java.util.Scanner;


public class Circle
{
	private double radius;
	private double area;
	Scanner keyboard = new Scanner(System.in);


	public void setRadius(double rad)
	{
		radius = keyboard.nextInt();

	}

	public void calculateArea( )
	{
		area = 3.14159*radius*radius;

	}

	public void print( )
	{
	    System.out.println("The area is :: " + area);

	}

public static void main( String[] args )
{

	Circle run = new Circle();
	run.setRadius(5);
	run.calculateArea();
	run.print();
}
}