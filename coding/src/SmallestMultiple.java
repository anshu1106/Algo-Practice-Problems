import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestMultiple {
	
	public static void main(String args[]) throws IOException{
		int number;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		line = br.readLine(); 
		number = Integer.parseInt(line);
		String smallestMultiple = getSmallestMultiple(number);
		System.out.println(smallestMultiple);
	}

	private static String getSmallestMultiple(int number) {
		// TODO Auto-generated method stub
		String multiple = "1";
		int remainder = 1;
		while(remainder%number !=0){
			remainder = remainder*10 + 1;
			multiple = multiple+"1";
		}
		return multiple;
	}

}
