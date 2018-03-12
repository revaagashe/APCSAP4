package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grade {
	private double grade;
	
	public Grade()
	{
		setGrade(grade);
	}
	
	public Grade(double gradeValue)
	{
		setGrade(gradeValue);		
	}
	
	public void setGrade(double gradeValue){
		grade = gradeValue;
	}
	
	public String getLetterGrade(){
		String letter = " ";
		if (grade>=90)
			letter="A";
		else if (grade>=80)
			letter="B";
		else if (grade>=70)
			letter="C";
		else if (grade>=60)
			letter="D";
		else if (grade>=0)
			letter="F";
		
		return letter;
	}
	
	public double getNumericGrade(){
		return grade;
	}
	
	public String toString() {
		String x;
		x = getNumericGrade() + "\n" + getLetterGrade();
		return x;
	}
	
}
