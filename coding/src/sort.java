import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class sort {
	
	public static void main(String args[])
	{
		
		int input = 50;
		int[] input1 = {1,12,5,111,200,1000,10,9,6,7,4};
		Arrays.sort(input1);
		int output[] = new int[2];
		output=getMaximumToysWithMaxSaving(input, input1);
		
		
		
	}
	
	 public static int[] getMaximumToysWithMaxSaving(int input1,int[] input2)
	    {
	        //Write code here
	        Arrays.sort(input2);
	        int sum=0;
	        int count =0;
	        int output[]=new int[2];
	        while(sum<input1)
	        {
	              	sum=sum+input2[count];
	              	count++;
	        }
	        if(sum>input1)
	        {
	        	count--;
	        	sum=sum-input2[count];
	        }
	        output[0]=count;
	        output[1]=input1-sum;
	        return output;
	        

	    }

}
