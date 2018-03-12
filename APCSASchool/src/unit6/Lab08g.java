package unit6;

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		//add test cases
		LoopStats x = new LoopStats();
		x.setNums(1, 5);
		System.out.println(x);
		x.getTotal();
		x.getEvenCount();
		x.getOddCount();
		
		x.setNums(2, 8);
		System.out.println(x);
		x.getTotal();
		x.getEvenCount();
		x.getOddCount();
		
		x.setNums(5, 15);
		System.out.println(x);
		x.getTotal();
		x.getEvenCount();
		x.getOddCount();
					
	}
}