package journals;

public class EliminateDuplicates {
	public static void eliminateDuplicates(int[] list){
		String nums = list[0] + " ";
		
		for(int x = 1; x<list.length; x++){
			if (nums.indexOf(list[x] + " ") <0){
				nums += list[x]+" ";
			}
			System.out.println(nums);
			String[] numbers = nums.split(" ");
			int[] noDups = new int[numbers.length];
			
			for (int i=0; i<noDups.length; i++){
				noDups[i] = Integer.parseInt(numbers[i]);
			}
			System.out.println(noDups);
		}
	}
	
	public static void main(String[] args) {
		EliminateDuplicates x = new EliminateDuplicates();
		int[] list = {1,2,3,4,2,3,5,2};
		x.eliminateDuplicates(list);
	}
}
