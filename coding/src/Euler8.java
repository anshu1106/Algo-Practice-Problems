import java.util.Scanner;


public class Euler8 {
	
	public static void main(String args[])
	{
		int tests,k,n;
		Scanner in = new Scanner(System.in);
		tests=in.nextInt();
		String num;
		long maxProd = 1, prod;
		
		
		for(int i=0;i<tests;i++)
		{
			prod = 1;
			maxProd=0;
			n=in.nextInt();
			k=in.nextInt();
			num=in.next();
			for(int p=0;p<num.length()-k;p++)
			{
				prod = 1;
				for(int q=0;q<k;q++)
				{
					prod=prod*(num.charAt(p+q)-'0');
				}
				maxProd=Math.max(maxProd, prod);
			}
			System.out.println(maxProd);
		}
	}
	

}
