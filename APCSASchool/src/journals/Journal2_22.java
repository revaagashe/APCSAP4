package journals;
import java.util.Random;

public class Journal2_22 {
int num1 = 0;
int num2 = 0;
int num3 = 0;
int num4 = 0;
int num5 = 0;
int num6 = 0;
int num7 = 0;
int num8 = 0;
int num9 = 0;
int num0 = 0;
int[] array = {num0, num1, num2, num3, num4, num5, num6, num7, num8, num9};
	public void randomGenerator(){
		for (int i = 1; i<101; i++){
			Random rand = new Random();
			int num = rand.nextInt(9);
			if (num == 1){
				num1++;
			}
			if (num == 2){
				num2++;
			}
			if (num == 3){
				num3++;
			}
			if (num == 4){
				num4++;
			}
			if (num == 5){
				num5++;
			}
			if (num == 6){
				num6++;
			}
			if (num == 7){
				num7++;
			}
			if (num == 8){
				num8++;
			}
			if (num == 9){
				num9++;
			}
			if (num == 0){
				num0++;
			}
			
			
		}
		int[] array = {num0, num1, num2, num3, num4, num5, num6, num7, num8, num9};
		for (int item : array){
			System.out.println(item);
		}
	}
	
	public static void main( MyString1 args[] )
	{
		Journal2_22 x = new Journal2_22();
		x.randomGenerator();
		
		
	}
}
