import java.math.BigInteger;
import java.util.Scanner;


public class EulerCriterion {
	
	public static void main(String args[])
	{
		int tests;
		Scanner in = new Scanner(System.in);
		tests=in.nextInt();
		for(int i=0; i < tests; i++)
		{
			long a = in.nextLong();
			long m = in.nextLong();
			boolean result = checkForEulerCriterion(a,m);
			if(result)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}

	private static boolean checkForEulerCriterion(long a , long m) {
		
		
		// TODO Auto-generated method stub
		int res = pow(a, m);
		if(res == 1)
		{
			return true;
		}
		return false;
	}
	
	private static int pow(long a, long m){
		long ans=1;
		long k =(m-1)/2;
		while(k!=0)
        {
            if(k%2!=0)ans=ans*a%m;
            a=a*a%m;
            k/=2;
        }
		
		return (int) ans;
		
	}

}
