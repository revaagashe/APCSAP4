package unit8;

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	public String roman;


	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;


	}

	public RomanNumeral(Integer orig)
	{

		number = orig;

	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		setRoman(roman);
		//int i = 0;
		int answer = 0;
		roman.replaceAll("CM", "DCCCC");
		roman.replaceAll("CD", "CCCC");
		roman.replaceAll("XC", "LXXXX");
		roman.replaceAll("XL", "XXX");
		roman.replaceAll("IX", "VIIII");
		roman.replaceAll("IV", "IIII");

		while (roman.length()>0){
			for (int y = 0; y<14;y++){
				for (int i=0; i<roman.length();i++){
				if (LETTERS[y] == roman.substring(i, i+1)){
					answer = answer + NUMBERS[y];
	
				}
			

			}
			}
		}
		
		
		return answer;
	}

	public String toString()
	{	
		setNumber(number);
		int i = 0;
		String answer = "";
		while (number>0){
		while (NUMBERS[i]>number){
			i++;
		}
		
		number = number - NUMBERS[i];
		answer = answer + LETTERS[i];
		}
		return answer + "\n";
	}
}