package unit6;

import static java.lang.System.*;
import java.lang.Math;

 class Prime
{
	private int number;
	String output;


	public Prime()
	{
		number = 0;

	}

	public Prime(int num)
	{
		setPrime(num);

	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
		for (int x = 2; x < (Math.sqrt(number)); x++) {
			if(number%x==0){
				return false;
				
			}
		}
		return true;
	}

	public String toString()
	{
		if (isPrime())
		{
		output= number + " is prime. \n";
		}
		else {
		output = number + " is not prime. \n";
}
		//System.out.println(output);






		return output;
	}
}
