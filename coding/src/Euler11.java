import java.util.Scanner;


public class Euler11 {
	
	public static void main(String args[])
	{
		int grid[][]=new int[20][20];
		Scanner in = new Scanner(System.in);
		int i,j;
		int product = 0;
		for( i=0;i<20;i++)
		{
			for(j=0;j<20;j++)
			{
				grid[i][j]=in.nextInt();
			}
		}
		//horizontal max;
		for(i=0;i<20;i++)
		{
			for(j=0;j<17;j++)
			{
				product=Math.max(product,grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3]);
			}
		}
		//vertical max
		for(j=0;i<20;j++)
		{
			for(i=0;j<17;i++)
			{
				product=Math.max(product,grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j]);
			}
		}
		//diagonal right max
		for(i=0;i<17;i++)
		{
			for(j=0;j<17;j++)
			{
				product=Math.max(product, grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3]);
			}
		}
		
		for(i=0;i<17;i++)
		{
			for(j=3;j<20;j++)
			{
				//System.out.println("**I*** "+i+"****J*** "+j);
				product=Math.max(product,grid[i][j]*grid[i+1][j-1]*grid[i+2][j-2]*grid[i+3][j-3]);
			}
		}
		
		System.out.println(product);
		
		
			
		
		
		
	}

}
