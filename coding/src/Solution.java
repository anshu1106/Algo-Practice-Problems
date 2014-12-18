import java.io.*;
import java.util.*;
import java.math.*;


public class Solution {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	static ArrayList<Integer>[] a;
	static int res, v, maxD;
	static int[] cnt;
	
	static void solve() throws Exception {
		int n = nextInt();
		int m = nextInt();
		a = new ArrayList[n + 1];
		for (int i = 1; i <= n; ++i) {
			a[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n - 1; ++i) {
			int x = nextInt();
			int y = nextInt();
			a[x].add(y);
			a[y].add(x);
		}
		for (int mm = 0; mm < m; ++mm) {
			v = nextInt();
			int k = nextInt();
			cnt = new int[n + 1];
			res = 0;
			for (int i = 1; i <= k; ++i) {
				maxD = 0;
				dfs(v, -1, 0);
				res += maxD;
			}
			out.println(res);
		}
	}
	
	static void dfs(int x, int from, int d) {
		if (d > maxD || (d == maxD && (cnt[x] < cnt[v] || (cnt[x] == cnt[v] && x < v)))) {
			maxD = d;
			v = x;
		}
		for (int i = 0; i < a[x].size(); ++i) {
			int y = a[x].get(i);
			if (y != from) {
				dfs(y, x, d + 1);
			}
		}
	}
	
	static int sqr(int x) {
		return x * x;
	}
	
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	
	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static BigInteger nextBigInteger() throws IOException {
		return new BigInteger(next());
	}
	
	static String next() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}
	
	static String nextLine() throws IOException {
		tok = new StringTokenizer("");
		return in.readLine();
	}

	static boolean hasNext() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			String s = in.readLine();
			if (s == null) {
				return false;
			}
			tok = new StringTokenizer(s);
		}
		return true;
	}

	public static void main(String args[]) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new OutputStreamWriter(System.out));
			//in = new BufferedReader(new FileReader("input.in"));
			//out = new PrintWriter(new FileWriter("output.out"));
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			java.lang.System.exit(1);
		}
	}
}