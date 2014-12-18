import java.util.Scanner;


public class Euler14 {
	
	public static void main(String args[])
	{
		long seq[]=new long[5000000+1];
		int maxSeq[]=new int[5000000+1];
		seq[0]=0;
		maxSeq[0]=0;
		maxSeq[1]=1;
		seq[1]=1;
		long num,count;
		for(int i=2;i<seq.length;i++)
		{
			count=1;
			num=i;
			while(num!=1)
			{
				if(num<=seq.length && seq[(int) num]>0)
				{
					seq[i]=seq[(int) num]-1;
					 num=1;
					
				}
				else if(num%2==0)
				{
					num=num/2;
					count++;
					
				}
				else
				{
					num=3*num+1;
					count++;
				}
				
			}
			seq[i]+=count;
			if(seq[maxSeq[i-1]]<=seq[i])
			{
				maxSeq[i]=i;
			}
			else
			{
				maxSeq[i]=maxSeq[i-1];
			}
			
			
		}
		
		int tests,n;
	    Scanner in =new Scanner(System.in);
	    tests=in.nextInt();
	    for(int j=0;j<tests;j++)
	    {
	    	n=in.nextInt();
	    		    	
	    	System.out.println(maxSeq[n]);
	    }
	    
	    
	
		
	}

}
