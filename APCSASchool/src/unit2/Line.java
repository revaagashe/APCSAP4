package unit2;
import java.util.Scanner;

public class Line {
	private double xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(double x1, double y1, double x2, double y2)
	{
xOne=x1;
yOne=y1;
xTwo=x2;
yTwo=y2;




	}

	public void setCoordinates(double x1, double y1, double x2, double y2)
	{
		Scanner keyboard = new Scanner(System.in);

		 x1 = keyboard.nextInt();
		 y1 = keyboard.nextInt();
		 x2 = keyboard.nextInt();
		 y2 = keyboard.nextInt();




	}

	public void calculateSlope( )
	{
		slope = (yTwo-yOne)/(xTwo-xOne);


	}

	public void print( )
	{
System.out.println("The slope is :: " + slope);



	}


	  public static void main(String[] args) {
		  
		  Line x = new Line(0, 5, 3, 0);
		  x.setCoordinates(0,1,9,0);
		  x.calculateSlope();
		  x.print();
	  }
	}

