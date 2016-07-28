
public class PalindromicInteger {
	
	public static void main(String args[]){
		int number = 123431;
		String word = Integer.toString(number);
		if (isPalindromeNumber(word)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

	private static boolean isPalindromeNumber(String word) {
		// TODO Auto-generated method stub
		
		int length = word.length();
		String reverse = "";
	 
		for ( int i = length - 1; i >= 0; i-- )
			reverse = reverse + word.charAt(i);
 
		if (word.equals(reverse))
			return true;
		return false;
	}

}
