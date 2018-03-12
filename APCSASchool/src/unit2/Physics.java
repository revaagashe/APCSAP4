package unit2;
import java.util.Scanner;

public class Physics {
	Scanner keyboard = new Scanner(System.in);

	public void calculateLength(){
System.out.println("Enter velocity in m/s");
double velocity = keyboard.nextDouble();
System.out.println("Enter acceleration in m/s^2");
double acceleration = keyboard.nextDouble();
double runwayLength = (velocity*velocity)/(acceleration*2);
System.out.println("The minimum runway length is " + runwayLength);
}
	
	public static void main(String[] args) {
		Physics a = new Physics();
		a.calculateLength();

		
	}
}