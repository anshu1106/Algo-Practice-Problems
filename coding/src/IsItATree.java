import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class IsItATree {
	static Map<Integer, List<Integer>> adjacencyList;
	static boolean visited [];

	public static void main(String args[])
	{
		adjacencyList = new HashMap<Integer, List<Integer>>();
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int L = in.nextInt();
		for (int i = 1 ; i <= N ; i++)
        { 
			adjacencyList.put(i, new LinkedList<Integer>());
        }
		visited = new boolean[N+1];
		for(int i=0;i<L; i++)
		{
			int u = in.nextInt();
			int v = in.nextInt();
			addEdge(u,v);
		}
		Arrays.fill(visited, false);
		boolean hasCycle = false;
		for(int j = 1; j <=N && !hasCycle; j++ )
		{
			
			if(!visited[j])
			{
				hasCycle=dfs(j);
				
			}
		}
		
		if(hasCycle)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
	
	private static boolean dfs(int j) {
		// TODO Auto-generated method stub
		
		visited[j] = true;
	    List<Integer> edges = adjacencyList.get(j);
	    Iterator<Integer> it = edges.iterator();
		while (it.hasNext()) {
			int i = it.next();
			if(visited[i] && i!=j)
			{
				return true;
			}
			else
			{
				  visited[i] = true;
		            if(dfs(i) == true)
		            {
		            	return true;
		            }
			}
			
	          
	       
		}
		return false;
    
	}
	
	private static void addEdge(int u, int v)
	{
		
		   List<Integer> slist = adjacencyList.get(u);
	       slist.add(v);
	       List<Integer> dlist = adjacencyList.get(v);
	       dlist.add(u);
		
	}

}
