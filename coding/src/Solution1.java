
//Reverse Level Order traversal
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Solution1 {
	
	
	public static void main(String args[])
	{
		int root = 0;
		Scanner in = new Scanner(System.in);
		int nodes=in.nextInt();
		int graph[][]=new int[nodes][2];
		for(int i=0;i<nodes;i++)
		{
			graph[i][0]=graph[i][1]=-2;
		}
		
		for(int i =0;i<nodes;i++)
		{   
			int num=in.nextInt();
			if(num!=-1)
			{
				if(graph[num][0]==-2)
				{
					graph[num][0]=i;
				}
				else
				{
					graph[num][1]=i;
				}
			}
			else
			{
				root=i;
			}
		
		}
		
		for(int i=0;i<nodes;i++)
		{
			System.out.println(graph[i][0]+"    "+graph[i][1]);
		}
		printReverseLevelOrderTraversal(graph, root, nodes);
	}

	private static void printReverseLevelOrderTraversal(int[][] graph, int root, int nodes) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList<Integer>(); 
		int count=0;
		Stack = new Stack();
		q.add(root);
		q.add(-3);
		while(!q.isEmpty() && count<nodes)
		{
			int a=q.remove();
			if(a!=-3)
			{
				count++;
			}
			s.add(a);
			if(a==-3)
			{
				q.add(-3);
			}
			else
			{
				if(graph[a][1]!=-2)
					q.add(graph[a][1]);
				if(graph[a][0]!=-2)
					q.add(graph[a][0]);
					
			}
			
		}
		
		while(!s.empty())
		{
			
//			if((Integer)s.pop()==-3)
//				System.out.println();
//			else
//			{
			
			int top = (Integer)s.pop();
			if(top==-3)
				System.out.println();
			else
				System.out.print(top+" ");

		//	}
		}
		
		
	}

}
