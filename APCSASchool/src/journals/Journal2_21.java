package journals;

public class Journal2_21 {
	public static void main(MyString1 args[])
	{
		Journal2_21 x = new Journal2_21();
		x.isPalindrome(456);
	}
	// Return the reversal of an integer, i.e., reverse(456) returns 654 public static int reverse(int number) 

	public int reverse (int num) {
		int num1 = num%10;
		int num2 = ((num-num1)/10)%10;
		int num3 = ((((num-num1)/10)-num2)/10)%10;
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3 + "\n\n");
		return (num1*100 + num2*10 + num3 );
		
	}
	
	// Return true if number is a palindrome
	public boolean isPalindrome (int num) {
		
		if (num == reverse(num)){
			System.out.println("\nIt is a palindrome");
			return true;
		}
		System.out.println("\nIt is not a palindrome");
		return false;
	}
}
