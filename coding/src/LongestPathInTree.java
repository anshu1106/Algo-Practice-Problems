
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		
	}
}

class Tree
{
	Node left;
	Node right;
	int data;
	Tree(int data, Node left, Node right)
	{
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

public class LongestPathInTree {
	
	public static void main(String args[])
	{
		Tree t = new Tree(1,null,null);
		
	}

}
