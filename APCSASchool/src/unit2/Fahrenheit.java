package unit2;

import java.util.Scanner;

public class Fahrenheit {
	private double fahrenheit;
	Scanner keyboard = new Scanner(System.in);

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
		fahrenheit = keyboard.nextInt();

	}

	public double getCelsius()
	{
		double celsius = 0.0;
		//add code to convert fahrenheit to celsius
		celsius = (fahrenheit - 32)*5/9;

		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println(fahrenheit + " degrees Fahrenheit == " + getCelsius() + " degrees Celsius");
	}
	
	public static void main(String[] args) {
		Fahrenheit a = new Fahrenheit();
		a.setFahrenheit(80);
		a.getCelsius();
		a.print();
	}
}
