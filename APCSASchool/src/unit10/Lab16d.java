package unit10;
import static java.lang.System.*;

public class Lab16d
{
	public static void main( String args[] )
	{
		System.out.println(System.getProperty("user.dir"));
		//make a new MadLib
		String MadLibFile = "\\src\\Lab16d\\story.dat";
		MadLib x = new MadLib(MadLibFile);
		//out.println("\n");
	}
}