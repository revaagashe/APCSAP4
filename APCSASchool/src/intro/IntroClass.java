package intro;
import java.lang.Math;
public class IntroClass {

	public static void main(String[] args) {
		//exercise 1
		int a = 1;
		for (a=1; a<5; a++){
			System.out.println(a + " " +  a*a + " " + a*a*a + "\n");
		}
		
		//exercise 2
		System.out.print(9.5*4.5 + "\n");
		System.out.print(-2.5*3 + "\n");
		System.out.print(45.5-3.5 + "\n\n\n");
		
		//exercise 3
		int population = 312032486;
		double birth = population + 365*24.0*60*60/7;
		//System.out.println("Birth:");
		//System.out.println(birth);
		//System.out.println("Death:");		
		double deaths = population -365*24.0*60*60/13;
		//System.out.println(deaths);
		//System.out.println("Immigrants");
		double immigrants = population + 365*24.0*60*60/45;
		//System.out.print(immigrants);
		System.out.println("Population:" );
		for (int x=1;x<6; x++){
			System.out.print("Year " + x + ": ");
			System.out.print(population + x*(birth + immigrants - deaths));
			System.out.print("\n");
		}
}
}
 