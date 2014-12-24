import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class JourneyToTheMoon2 {
	
	static Map<Integer, List<Integer>> adjacencyList;
	
	static boolean visited [];
	
	static int vertices = 0;
	
	static int numComponents = 0;
	
	static int components[];
		
	public static void main(String args[])
	{
		adjacencyList = new HashMap<Integer, List<Integer>>();
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int L = in.nextInt();
		for (int i = 0 ; i <= N ; i++)
        { 
			adjacencyList.put(i, new LinkedList<Integer>());
        }
		visited = new boolean[N];
		for(int i=0;i<L; i++)
		{
			int u = in.nextInt();
			int v = in.nextInt();
			addEdge(u,v);
		}
		components = new int[1000000];
				
		Arrays.fill(visited, false);
		
		for(int j = 0; j <=N-1; j++ )
		{
			vertices = 0;
			if(!visited[j])
			{
				dfs(j);
				components[numComponents]=vertices;
				numComponents++;
			}
		}
		
	}

	private static void dfs(int j) {
		// TODO Auto-generated method stub
		
		visited[j] = true;

	    vertices++;

	    List<Integer> edges = adjacencyList.get(j);
	    Iterator<Integer> it = edges.iterator();
		while (it.hasNext()) {
			int i = it.next();
			if(!visited[i])
	        {
	            visited[i] = true;
	            dfs(i);
	        }
		}

	    
	}

	private static void addEdge(int u, int v)
	{
		
		   List<Integer> slist = adjacencyList.get(u);
	       slist.add(v);
	       List<Integer> dlist = adjacencyList.get(v);
	       dlist.add(u);
		
	}

}
