package unit2;
import java.util.Scanner;

public class SavingsAccount {
	Scanner keyboard = new Scanner(System.in);

double interest, initialbalance, interestrate;
public void addInterest(){
	System.out.println("Enter the interest");
	interest = keyboard.nextInt();
}	

public static void main(String[] args) {
	SavingsAccount test = new SavingsAccount();
	test.addInterest();
	
}
}
