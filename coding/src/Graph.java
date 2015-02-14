import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
public class Graph
{
	private Map<Integer, List<Integer>> Adjacency_List;
	
	public Graph(int numVertices)
	{
		Adjacency_List = new HashMap<Integer, List<Integer>>();
		for(int i = 1; i <= numVertices; i++)
		{
			Adjacency_List.put(i, new LinkedList<Integer>());
		}
	}
	
	public void setEdge(int source, int destination)
	{
		if (source > Adjacency_List.size() || destination > Adjacency_List.size())
	       {
	           System.out.println("the vertex entered in not present ");
	           return;
	       }
	       List<Integer> slist = Adjacency_List.get(source);
	       slist.add(destination);
	       List<Integer> dlist = Adjacency_List.get(destination);
	       dlist.add(source);
	}
	/* Returns the List containing the vertex joining the source vertex */		
    public List<Integer> adj(int source)
    {
        if (source > Adjacency_List.size())
        {
            System.out.println("the vertex entered is not present");
            return null;
        }
        return Adjacency_List.get(source);
    }
    
    public int V()
    {
    	return Adjacency_List.size();
    }
    
    public void dfs(Graph G, int v)
    {
    	
    }
}