/* Create a linked list with 4 elements and write a function with
 * signature int countNodes(Node head) which will return the number of nodes in linked list
 */

public class Node {
	int data;
	Node next;
	
	Node(int data){ 
		this.data=data;
	}
	
	public static void main(String[] args) {
		
		Node head=new Node(2);
		Node n1=new Node(3);
		Node n2=new Node(5);
		Node n3=new Node(2);
		
		head.next=n1;
		n1.next=n2;
		n2.next=n3;
		
		System.out.println(countNodes(head));
		
	}
	
	static int countNodes(Node head) {
		int count=1;
		Node current=head;
		
		while(current.next!=null) {
			current=current.next;
			count++;
		}
		return count;
	}
}
