import java.util.Scanner;


public class Euler10 {
	static boolean[] isPrime = new boolean[1000000+1];
	static long[] sum = new long[1000000+1];
	
	public static void main(String args[])
	{  //use seive to find primes
		seive();
		//precompute sum
		precomputeSum();
		int tests;
		int n;
		Scanner in = new Scanner(System.in);
		tests=in.nextInt();
		
		for(int i =0;i<tests;i++)
		{   
			n=in.nextInt();
			
			System.out.println(sum[n]);
		}
	}

	private static void seive() {
		
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        isPrime[1]=false;

        // mark non-primes <= N using Sieve of Eratosthenes
        for (int i = 2; i*i < isPrime.length; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[i]) {
                for (int j = i; i*j < isPrime.length; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
		
	}
	
	private static void precomputeSum()
	{
		sum[0]=sum[1]=0;

        for (int i = 2; i < isPrime.length; i++) {
        	if(isPrime[i])
        	{
        		sum[i]=sum[i-1]+i;
        	}
        	else
        	{
        		sum[i]=sum[i-1];
        	}
        }
	}
	
	

}
