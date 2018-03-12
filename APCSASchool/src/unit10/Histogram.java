package unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;
	ArrayList<Character> newLetters;


	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();

	}

	public Histogram(char[] values, String fName)
	{
	letters = new ArrayList<Character>(values.length);

	for (int x = 0; x<values.length; x++){
		letters.add(values[x]);
		
	}
	fileName = fName;




		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		
	count = new ArrayList<Integer>(letters.size());

				Scanner file = new Scanner(new File(fileName));
				String Lstring;
				String filestring = "";
while (file.hasNext()){
				Lstring = file.next();
				filestring+= Lstring;
			}	
					int letterCount = 0;

for (int y =0; y<letters.size(); y++){
			letterCount=0;

	for (int x = 0; x<filestring.length(); x++){
			char keyLetter = letters.get(y);

				if (filestring.charAt(x) == keyLetter){
					letterCount++;
					}
	//System.out.println(letterCount);
		


}
	count.add(letterCount);

}


	}

	public char mostFrequent()
	{
		int max = count.get(0);
		char maxChar = letters.get(0);
	for (int x = 0; x<count.size(); x++)	{
		if (count.get(x)>max){
			max = count.get(x);
			maxChar = letters.get(x);
		}
	}
		return maxChar;
	}

	public char leastFrequent()
	{
		int least = count.get(0);
		char leastChar = letters.get(0);
		for (int x = 0; x<count.size(); x++)	{
		if (count.get(x)<least){
			least = count.get(x);
			leastChar = letters.get(x);
		}
	}


		return leastChar;
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}