import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Euler5 {
	
	public static long fact[]=new long[41];
	
	public static void main(String args[])
	{
		int cases;
		calculateSmallestMultiple();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			cases=Integer.parseInt(br.readLine());
			int num;
			for(int count=0;count<cases;count++)
			{
				num=Integer.parseInt(br.readLine());
				System.out.println(fact[num]);
				
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void calculateSmallestMultiple() {
		// TODO Auto-generated method stub
		fact[0]=0;
		fact[1]=1;
		fact[2]=2;
		
		for(int i=3;i<=40;i++)
		{
			if(fact[i-1]%i == 0)
			{
				fact[i]=fact[i-1];
			}
			else
			{
				fact[i]=lcm(i,fact[i-1]);

			}
		}
		
		
	}
	
	private static long lcm(long x , long y)
	{
		return (x*y)/gcd(x,y);
	}
	
	private static long gcd(long x,long y)
	{
		long temp;
		while(y!=0)
		{
			temp=y;
			y=x%y;
			x=temp;
		}
		return x;
		
	}
	
	
}
