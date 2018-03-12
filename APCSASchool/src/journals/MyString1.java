package journals;

public class MyString1 {
	char[] string;
	public MyString1(char[] chars){
		string = chars;
		
	}
	public char charAt(int index) {
		char indexChar;
		indexChar = string[index];
		return indexChar;
		
	} 
	public int length() {
		int count = 0;
		for (int y = 0; y<string.length;y++){
			count++;
		}
		return count;
	} 
	public MyString1 substring(int begin, int end) {
		char[] substring = new char[end-begin];
		MyString1 x = new MyString1(substring);
		for (int a = begin; a<(end);a++){
			substring[a-begin] = string[a];
		}
		return x;
	} 
	public MyString1 toLowerCase() {
		MyString1 x = new MyString1(string);
		for (int b = 0; b<string.length;b++){
			if (string[b] >= 65 && string[b]<= 90){
				string[b] +=32;
			}
		}
		return x;
	} 
	public boolean equals(MyString1 s) {
		for (int c = 0; c<string.length;c++){
			if (string[c] == s.charAt(c)){
				return true;
			}
		}
		return false;
	} 
	public static MyString1 valueOf(int num) {
		//MyString1 x = new MyString1(string);
		int len = 0;
		while (num>0){
			len++;
			num = num/10;
		}
		char[]temp = new char[len];
		for (int i = temp.length-1; i>0; i--){
			temp[i] = (char)(num%10);
			num = num/10;
		}
		
		MyString1 newString = new MyString1(temp);
		return newString;
		
	}
	public static void main( String args[] )
	{
		char[] x = {'a', 'b', 'c'};
		MyString1 y = new MyString1(x);
		System.out.println(y.substring(0,1));
	}

}
