import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Node11{
	String name;
	String parent;
	Node11 child1;
	Node11 child2;
	String data;
	int depth;
	
}
public class MakePath {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		line = br.readLine();
	    String nodes[] = line.split("}");
	    Node11 parentNode = null;
	    int maxDepth =0;
	    for (int count=0; count<nodes.length; count++){
	    	String node = nodes[count];
	    	
	    	
	    	node = node.trim();
	    	char zeroChar = node.charAt(0);
	    	 if(zeroChar !='{'){
	 	    	System.out.println("Bad Input");
	 	    	return;
	 	    }
	    	String nodeDetails[] = node.split("-");
	 	    if (nodeDetails.length != 3)
	 	    {
	 	    	System.out.println("Bad Input");
	 	    	return;
	 	    }
	    	
	    }
	    
	    
	    Map<String, Node11>  map = new HashMap<String, Node11>();
	    for(int count=0; count<nodes.length; count++){
	    	String node = nodes[count];
	    	String nodeDetails[] = node.split("-");
	    	Node11 treeNode = new Node11();
	    	treeNode.name = nodeDetails[0];
	    	treeNode.parent="{"+nodeDetails[1];
	    	treeNode.data =nodeDetails[2];
	    	
	    	map.put(treeNode.name, treeNode);
	    	if(treeNode.parent.equals("null")){
	    		treeNode.depth = 1;
	    	}
	    	else{
	    		 parentNode = map.get(treeNode.parent);
	    		 if(parentNode!=null){
	    			 treeNode.depth = parentNode.depth+1;
	    		 }
	    		 
	    	}
	    	if(maxDepth<treeNode.depth){
	    		maxDepth = treeNode.depth;
	    	}
	    	
	    	
	    	
	    
	    }
	    System.out.println(maxDepth);
	    
       
		
	}

}
