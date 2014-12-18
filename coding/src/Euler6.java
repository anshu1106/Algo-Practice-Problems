import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Euler6 {
	
	public static void main(String args[])
	{
		int cases;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			cases=Integer.parseInt(br.readLine());
			int num;
			for(int count=0;count<cases;count++)
			{
				long sum1=0;
				long sum2=0;
				num=Integer.parseInt(br.readLine());
				for(int i=1;i<=num;i++)
				{
					sum1=sum1+i;
					sum2=sum2+i*i;
				}
				System.out.println(sum1*sum1-sum2);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
