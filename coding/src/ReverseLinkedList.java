import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Node12 {
    int data;
    Node12 next;
    
    Node12(int data, Node12 next){
    	this.data = data;
    	this.next = next;
    }
 }

public class ReverseLinkedList {
	

	
	
	public static void main(String args[]) throws IOException{
		Node12 list = new Node12(1,null);
		Node12 two = new Node12(2,null);
		Node12 three = new Node12(3,null);
		Node12 four = new Node12(4,null);
		Node12 five = new Node12(5,null);
		Node12 six = new Node12(6,null);
		Node12 seven = new Node12(7,null);
		Node12 eight = new Node12(8,null);
		list.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		seven.next = eight;
		Node12 reverse = null;
		System.out.println("Original Linked List is:");
		Node12 head = list;
		while(head!=null){
			System.out.print(head.data);
			head=head.next;
		}
		System.out.println();
		reverse = reverseLinkedList(list);
		System.out.println("Reversed Linked List is :");
		while(reverse!=null){
			System.out.print(reverse.data);
			reverse = reverse.next;
		}
			
	
		
		
	}

	private static Node12 reverseLinkedList(Node12 list) {
		// TODO Auto-generated method stub
		if(list==null){
			return null;
		}
		Node12 next = null;
		Node12 prev=null;
		Node12 current = list;
		next = current.next;
		while(current!=null){
			current.next = prev;
			prev=current;
			current = next;
			if(next!=null){
				next = next.next;
			}
			
		}
		return prev;
	}

}
