import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Euler3 {
	
	public static void main(String args[])
	{
		int cases;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num;
		long result=1;
		long factor=1;
		try {
			cases=Integer.parseInt(br.readLine());
			for(int count=0;count<cases;count++)
			{
				num = Long.parseLong(br.readLine());
				while(true)
				{
					factor = smallestPrimeFactor(num);
					if(factor<num)
					{
						num=num/factor;
					}
					else
						break;
				}
				
				System.out.println(num);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static long smallestPrimeFactor(long num) {
		// TODO Auto-generated method stub
		
		for(long j=2;j<=Math.sqrt(num);j++)
		{
			if(num%j == 0)
			{
				return j;
			}
			
		}
		
		return num;
	}

}
