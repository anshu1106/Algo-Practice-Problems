import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Euler1 {
	
	public static void main(String args[])
	{
//		int max =   1000000000+1;
//		int result[] = new int[max-10]; 
//		int threePointer = 0;
//		int fivePointer = 1;
//		result[0]=3;
//		result[1]=5;
//		for(int j=2;result[j]<max;j++)
//		{
//			result[j]=Math.min(result[threePointer]*3,result[fivePointer]*5);
//			if(result[j]==result[threePointer]*3)
//			{
//				threePointer++;
//			}
//			if(result[j]==result[fivePointer]*5)
//			{
//				fivePointer++;
//			}
//		}
		
		int cases;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			cases=Integer.parseInt(br.readLine());
			for(int count=0;count<cases;count++)
			{
				int num = Integer.parseInt(br.readLine());
				long multiples3=(num-1)/3;
				long multiples5=(num-1)/5;
				long multiples15=(num-1)/15;
				
				long sum3=(3*(multiples3)*(multiples3+1))/2;
				long sum5=(5*(multiples5)*(multiples5+1))/2;
				long sum15=(15*(multiples15)*(multiples15+1))/2;
				System.out.println(sum3+sum5-sum15);


			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
