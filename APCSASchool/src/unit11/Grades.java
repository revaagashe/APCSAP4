package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private Grade[] gradesList;
	double numGrades;

		
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{

		Scanner gradeScanner = new Scanner(gradeList);
		numGrades = gradeScanner.nextDouble();
		for (int x = 0; x<numGrades; x++){
			 gradesList[x] = new Grade(gradeScanner.nextDouble());
		}

	}
	
	public void setGrade(int spot, double grade)
	{
		Grade x = new Grade(grade);


	}
	
	public double getSum()
	{
		double sum=0.0;

		for (int x = 0; x<gradesList.length; x++){
			sum += gradesList[x].getNumericGrade();
		}


		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		Arrays.sort(gradesList);
		low = gradesList[0].getNumericGrade();




		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		Arrays.sort(gradesList);
		high = gradesList[gradesList.length-1].getNumericGrade();



		return high;
	}
	
	public int getNumGrades()
	{
		return gradesList.length;
	}
	
	public String toString()
	{
		String output="";





		return output;
	}	
}