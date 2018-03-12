package magpie;

public class Magpie2 {
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0
				|| statement.indexOf("pet") >= 0
				|| statement.indexOf("fish") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("hi") >= 0
				|| statement.indexOf("hello") >= 0
				|| statement.indexOf("hey") >= 0)
			
		{
			response = "Hi! What shall we talk about?";
		}
		else if (statement.indexOf("Mr.") >= 0
				|| statement.indexOf("Remington") >= 0
				|| statement.indexOf("teacher") >= 0)
			
		{
			response = "He sounds like a good teacher";
		}
		else if (statement.indexOf("asdf") >= 0
				|| statement.indexOf("jkl") >= 0
				|| statement.indexOf(";") >= 0)
			
		{
			response = "I too like to keyboard spam! as;dfasdjfhals";
		}
		else if ((statement.trim()).length() <= 0)
			
		{
			response = "Say something, please";
		}
		else if (statement.indexOf("hate") >= 0
				|| statement.indexOf("don't like") >= 0
				|| statement.indexOf("mean") >= 0)
			
		{
			response = "That's not very nice :( ";
		}
		else if (statement.indexOf("where") >= 0)
		{
			response = "somewhere over the rainbow";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "I see.";
		}
		else if (whichResponse == 5)
		{
			response = "That is very nice";
		}
		else if (whichResponse == 6)
		{
			response = "Interesting";
		}
		else if (whichResponse == 7)
		{
			response = "Okay";
		}
		return response;
	}
}