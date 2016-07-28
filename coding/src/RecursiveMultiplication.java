
public class RecursiveMultiplication {
	
	public static void main(String args[]){
		int a = 11;
		int b = 15;
		int product = multiplyNumbers(a,b);
		System.out.println(product);
		
	}

	private static int multiplyNumbers(int a, int b) {
		// TODO Auto-generated method stub
		int times = Math.min(a, b);
		int max = Math.max(a, b);
		int sum=0;
		while(times>0){
			sum=sum+max;
			times--;
					
		}
		return sum;
	}

}
