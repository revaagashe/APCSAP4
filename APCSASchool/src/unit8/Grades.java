package unit8;
import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables

	int numGrades;
	int[] grades;

	//set method
	public void setArray () {
	Scanner keyboard = new Scanner(System.in);
	
	
	System.out.println("How many grades?");
	numGrades = keyboard.nextInt();
	int[] grades1= new int[numGrades];
	
	System.out.println("Enter your grades");
	for (int x = 0; x<numGrades; x++){
		grades1[x] = keyboard.nextInt();
	}
		grades = grades1;
	for (int y=0; y<numGrades; y++) {
			System.out.println("grade " + y + " :: " + grades[y]);

	}
	System.out.println("\nAverage = " + getAverage());
		

	}


	private double getSum()
	{
		double sum=0.0;
		for (int x = 0; x<numGrades; x++){
			sum = sum + grades[x]; 
		}


		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/numGrades;


		return average;
	}


	//toString method



}
