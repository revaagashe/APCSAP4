package journals;

public class MyInteger {
	int num;
	public void MyInteger(int x){
		 num = x;
	}
	
	public int getInt(){
		return num;
	}
	
	public boolean isEven(int x){
		if(x%2 == 0){
			return true;
		}
		return false;
	}
	
	public boolean isOdd(int x){
		if(x%2==0){
			return false;
		}
		return true;
	}
	
	
	public boolean isPrime(int number)
	{
		for (int x = 2; x < (Math.sqrt(number)); x++) {
			if(number%x==0){
				return false;
				
			}
		}
		return true;
	}
	
	public boolean equals(int x){
		if (num == x){
			return true;
		}
		return false;
	}
	
	public int parseInt(char[] x){
		int y = 0;
		int exp = 0;
		for(int a = x.length-1; a>-1; a--){
			y+= Math.pow(10, exp)*x[a];
			exp++;
		}
		return y;
	}
	

}
