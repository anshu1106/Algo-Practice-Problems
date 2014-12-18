import java.util.Scanner;


public class SamAndSubstrings {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String num=in.next();
		long dp[]=new long[num.length()];
		
		dp[0]=num.charAt(0)-'0';
		for(int i=1;i<num.length();i++)
		{
			long subStringSum=0;
			for(int j=i;j>=0;j--)
			{
				long sub = Long.parseLong(num.substring(j, i+1));
				subStringSum=(subStringSum+sub)%(1000000000+7);
			}
			dp[i]=(dp[i-1]+subStringSum)%(1000000000+7);
		}
		System.out.println(dp[num.length()-1]);
	}

}
