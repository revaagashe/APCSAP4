package unit10;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Random;


public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		nouns = new ArrayList<>();
		verbs = new ArrayList<>();
		adjectives = new ArrayList<>();
		loadNouns();
		loadVerbs();
		loadAdjectives();

	}

	public MadLib(String fileName)
	{
		nouns = new ArrayList<>();
		verbs = new ArrayList<>();
		adjectives = new ArrayList<>();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "\\src\\unit10\\story.dat"));
				//boolean a = true;
				while (file.hasNext()){
				String next = file.next();

			/*	if (!file.hasNext()){
					a = false;
				}*/
				if (next.equals("#")){
					System.out.print(getRandomNoun() + " ");
				}
				else
					{
					if (next.equals("@")){
					System.out.print(getRandomVerb() + " ");
					}
					else {
						if (next.equals("&")){
							System.out.print(getRandomAdjective() + " ");
					}
						else 
							System.out.print(next + " ");
						//file.close();
				
						}
					}
				}

				
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "\\src\\unit10\\nouns.dat"));
		
			while (file.hasNext()){
				nouns.add(file.nextLine());
			}
		
		
		
		}
		catch(Exception e)
		{
			out.println(e);

		}	
		
	}
	
	public void loadVerbs()
	{
		try{
	
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "\\src\\unit10\\verbs.dat"));
			while (file.hasNext()){
				verbs.add(file.nextLine());
			}
			
			
	
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "\\src\\unit10\\adjectives.dat"));
			while (file.hasNext()){
				adjectives.add(file.nextLine());
			}
	
	
	
	
		}
		catch(Exception e)
		{
			out.println(e);

		}
	}

	public String getRandomVerb()
	{
		Random r = new Random();
		int x = r.nextInt(verbs.size());
		return verbs.get(x);
	}
	
	public String getRandomNoun()
	{
		Random r = new Random();
		int x = r.nextInt(nouns.size());
		return nouns.get(x);
	}
	
	public String getRandomAdjective()
	{
		
		Random r = new Random();
		int x = r.nextInt(adjectives.size());
		return adjectives.get(x);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}