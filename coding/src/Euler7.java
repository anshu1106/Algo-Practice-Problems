import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Euler7 {
	
	static long primes[]=new long[10000+1];
	
	public static void main(String args[])
	{
		primes[0]=0;
		long num=2;
		for(int i=1;i<primes.length;i++)
		{
			while(!isPrime(num))
			{
				num++;
			}
			primes[i]=num;
			num++;
		}
		int cases;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			cases=Integer.parseInt(br.readLine());
			int n;
			for(int count=0;count<cases;count++)
			{
				n=Integer.parseInt(br.readLine());
				System.out.println(primes[n]);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean isPrime(long num) {
		// TODO Auto-generated method stub
		if(num==2 || num==3)
			return true;
		if(num%2==0)
			return false;
		for(long count=3;count<=Math.sqrt(num);count=count+2)
		{
			if(num % count ==0)
				return false;
		}
		
		
		return true;
	}

}
