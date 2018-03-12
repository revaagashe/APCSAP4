package unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = 'a';

	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);

	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{

		if (getASCII() < 91 && getASCII() > 64){
			return true;
		}

		return false;
	}

	public boolean isLower( )
	{
		if (getASCII() < 123 && getASCII() > 96){
			return true;
		}


		return false;
	}
	
	public boolean isNumber( )
	{
		if (getASCII() < 158 && getASCII() > 47){
			return true;
		}


		return false;
	}	

	public int getASCII( )
	{
		int ASCII = theChar;
		return ASCII;
	}

	public String toString()
	{

		if(isUpper())
			return ("" + getChar() + "is an uppercase character. ASCII == " + getASCII() + "\n");
		if(isLower())
			return ("" + getChar() + "is a lowercase character. ASCII == " + getASCII() + "\n");
		if(isNumber())
			return ("" + getChar() + "is a number. ASCII == " + getASCII() + "\n");
		else
			return "It is not an alphanumeric";

	}
}