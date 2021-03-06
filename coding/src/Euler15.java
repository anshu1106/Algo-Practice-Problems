import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Euler15 {
	static long routes[][]=new long[500][500];
	public static void main(String args[])
	{
		for (int i=0;i<routes.length;i++)
		{
			for(int j=0;j<routes[0].length;j++)
			{
				if(i==0 && j == 0)
				{
					routes[i][j]=2%(1000000000+7);
					
				}
				else if(i== 0 && j>0 )
				{
					routes[i][j]=(routes[i][j-1]+1)%(1000000000+7);
				}
				else if(j==0 && i>0)
				{
					routes[i][j]=(routes[i-1][j]+1)%(1000000000+7);
				}
				else
				{
					routes[i][j]=(routes[i-1][j]+routes[i][j-1])%(1000000000+7);
				}
						
			}
		}
			
		int cases;
		Scanner in = new Scanner(System.in);
		try {
			cases=in.nextInt();
			int n,m;
			for(int count=0;count<cases;count++)
			{
				n=in.nextInt();
				m=in.nextInt();
				System.out.println(routes[n-1][m-1]);
			}

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
		
	}

}
