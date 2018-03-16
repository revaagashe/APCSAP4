package unit12;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word[] output = new Word[size];
		int i=0;
		while (file.hasNextLine()){
			output[i]=new Word(file.nextLine());
			i++;
			
		}
		Arrays.sort(output);

		for (Word j:output){
			System.out.println(j);
			
		}
	}
		
public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word=s;

	}
	public String getWord(){
		return word;
	}
	public boolean equals(Word rhs){
		if (word.length()==rhs.getWord().length()){
			return true;
		}
		return false;
	}

	public int compareTo( Word rhs )
	{
		if (equals(rhs)) {
			return this.getWord().compareTo(rhs.getWord());
			
		}
		else if (word.length() > (rhs.getWord()).length() ){
			return 1;
		}
		else {
			
			return -1;
		}
		
		
		
	}
	

	public String toString()
	{
		return word;
	}
}
}