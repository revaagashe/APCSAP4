package unit4;
import static java.lang.System.*;

public class Name {

	private String name;

	public Name()
	{
name="s";

	}

	public Name(String s)
	{
name = s;

	}

   public void setName(String s)
   {
name = s;

   }

	public String getFirst()
	{
		int space = name.indexOf(" ");
		String FirstName = name.substring(0, space);
		return FirstName;
	}

	public String getLast()
	{
		int space = name.indexOf(" ");

		String LastName = name.substring((space + 1), (name.length()));
		return LastName;
	}

 	public String toString()
 	{
 		return name + "\n";
	}
}
