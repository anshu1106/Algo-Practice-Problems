
public class MoneyLeft {
	
	public static void main(String args[] )
	{
		int money = 50;
		int[] toyPrices = {1,12,5,111,200,1000,10,9,6,7,4};
		int toyTypes=toyPrices.length;
		int priceArray[][]=new int[money+1][toyTypes+1];
				
		for(int i=0; i<=money; i++)
		{
			priceArray[i][0]=0;
		}
		for (int i=0; i<=toyTypes;i++)
		{
			priceArray[0][toyTypes]=0;
		}
		for(int i=1;i<=money;i++)
		{
			for(int j=1;j<=toyTypes;j++)
			{
				if(i-toyPrices[j-1]>=0)
				{
					
					priceArray[i][j]=Math.max(priceArray[i][j-1],priceArray[i-toyPrices[j-1]][j-1]+1 );

				}
				else
				{
					priceArray[i][j]=priceArray[i][j-1];
				}
			}
		}
		int max=priceArray[money][0];
		int usedMoney=0;
		for(int j=1;j<=toyTypes;j++)
		{
			if(priceArray[money][j]>max)
				max=priceArray[money][j];
			if(priceArray[money][j]!=priceArray[money][j-1])
				usedMoney=usedMoney +toyPrices[j-1];
			
			
		}
		
		
	}

}