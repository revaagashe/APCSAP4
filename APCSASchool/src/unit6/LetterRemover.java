package unit6;
import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;
   		String cleaned=sentence;


	public LetterRemover()
	{
		//call set
		sentence = "";
		lookFor = 'a';
	}

	//add in second constructor
	public LetterRemover(String s, char rem){
		setRemover(sentence, lookFor);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int loc = sentence.indexOf(lookFor);
		while (loc > -1)
		{
			cleaned = sentence.substring(0, loc) + sentence.substring(loc+1);
			sentence = cleaned;
			loc = sentence.indexOf(lookFor);
			//return cleaned;
		}
		return sentence;



	}

	public String toString()
	{
		
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n";
}
}