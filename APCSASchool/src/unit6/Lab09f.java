package unit6;

public class Lab09f {

	  public static void main(String[] args) {
	  	
		  	LetterRemover x = new LetterRemover();
		  	x.setRemover("I am sam I am", 'a');
		  	System.out.println(x);
		  	
		  	x.setRemover("ssssssssxssssesssssesss", 's');
		  	System.out.println(x);
		  	
		  	x.setRemover("qwertyqwertyqwerty", 'a');
		  	System.out.println(x);
		  	
		  	x.setRemover("abababababa", 'b');
		  	System.out.println(x);
		  	
		  	x.setRemover("abababababa", 'x');
		  	System.out.println(x);

	  }
}
