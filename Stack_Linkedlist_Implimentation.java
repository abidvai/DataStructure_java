package Data_Structure_java;
import java.util.*;


public class Stack_Linkedlist_Implimentation {
	Node first;
	
	class Node{
		String item;
		Node next;
	}
	
	public void push(String item) {
		Node extranode = first;
		first = new Node();
		first.item = item;
		first.next = extranode;
	}
	
	public String pop() {
		if(first == null) {
			System.out.println("Stack is Empty!!!");
		}
		String item = first.item;
		first = first.next;
		return item;
	}
	
	public static void disPlay(Node first) {
		Node temp = first;
		while(temp != null) {
			System.out.println(temp.item + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Stack_Linkedlist_Implimentation sc = new Stack_Linkedlist_Implimentation();
		
		sc.push("abid");
		sc.push("Mamun");
		sc.push("Popy");
		sc.push("Pranto");
		
		disPlay(sc.first);
		
		System.out.println("Deleted name from the stack is " + sc.pop());
		
		disPlay(sc.first);
	}
}
