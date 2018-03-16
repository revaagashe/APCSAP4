package unit12;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18e.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word2[] output = new Word2[size];
		int i=0;
		while (file.hasNextLine()){
			output[i]=new Word2(file.nextLine());
			i++;
			
		}
		Arrays.sort(output);

		for (Word2 j:output){
			System.out.println(j);
			
		}
	}
}

 class Word2 implements Comparable <Word2>{

	private String word;

	public Word2( String s)
	{
		word=s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		char[] wordList=word.toCharArray();
		for (char i:wordList){
			if (vowels.indexOf(i)!=-1){
				vowelCount++;
			}
		}
		

		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{
		if (this.numVowels()==rhs.numVowels()){
			return this.word.compareTo(rhs.word);
		}
		else if (this.numVowels()>rhs.numVowels()){
			return 1;
		}
		
	
		return -1;
	}

	public String toString()
	{
		return word;
	}

}