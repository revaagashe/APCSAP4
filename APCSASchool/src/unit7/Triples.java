package unit7;
import static java.lang.System.*;

public class Triples
{
	   private int number;

		public Triples()
		{
			this(0);
		}

		public Triples(int num)
		{
			setNum(number);
		}

		public void setNum(int num)
		{
			num = number;

		}
		
		public void findTriples (int upper)
		{

			for (int c=1; c<upper; c++){
				for (int b=1; b<upper; b++){
					for (int a = 1; a<b;a++){
						if (a*a + b*b == c*c){
							if (greatestCommonFactor(a,b,c) == 1){
								System.out.println(a + "  " + b + "  " + c);

							}
						}
					}
				}
		
			}
		}
		
		private int greatestCommonFactor(int a, int b, int c)
		{
			int max = 0;
			for (int x = a; x>0; x = x-1 ){
				if (a%x==0 && b%x==0 && c%x==0){
					return x;
					//break;
					
				}
			
			}
	return 1;

		}

		public String toString()
		{
			String output=" ";






			return output+"\n";
		}
}