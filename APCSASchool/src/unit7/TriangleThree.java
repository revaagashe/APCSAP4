package unit7;
import static java.lang.System.*;
import java.util.Scanner;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		
	}

	public TriangleThree(int count, String let)
	{

	}

	public void setTriangle( String let, int sz )
	{
		for (int outer = 1; outer<=sz; outer++){
			for (int space = outer; space < sz; space ++){
				System.out.print(" ");
			}
			for (int inner = 1; inner <=outer; inner++){
				
				System.out.print(let);
			}
			System.out.println();
		}
	}

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}