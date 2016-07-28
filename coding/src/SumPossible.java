import java.util.Arrays;

public class SumPossible {
	
	public static void main(String args[]){
		int numbers[] = {62, 11, 18, 21, 28, 31, 38, 40, 55, 60};
		int sum = 66;
		if (sumPossible(numbers,sum)){
			System.out.println("Yes");
			
		}
		else{
			System.out.println("No");
		}
	}

	private static boolean sumPossible(int[] numbers, int sum) {
		int i = 0;
		int j = numbers.length-1;
		Arrays.sort(numbers);
		while(i<j && j>=0 && i<numbers.length){
			if(numbers[i]+numbers[j]==sum){
				return true;
			}
			else if(numbers[i]+numbers[j]<sum){
				i++;
			}
			else if (numbers[i]+numbers[j]>sum){
				j--;
			}
		}
		
		
		return false;
		
		
		
	}

}
