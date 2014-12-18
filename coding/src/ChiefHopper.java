import java.util.Scanner;


public class ChiefHopper {
	
	public static void main(String args[])
	{
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		int heights[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			heights[i]=in.nextInt();
		}
		int currEnergy=0;
		int prevEnergy=0;
		for(int i=n;i>0;i--)
		{
			prevEnergy=(currEnergy+heights[i])/2;
			if((currEnergy+heights[i])%2!=0)
			{
				prevEnergy=prevEnergy+1;
			}
			currEnergy=prevEnergy;
		}
		System.out.println(currEnergy);
	}

}
