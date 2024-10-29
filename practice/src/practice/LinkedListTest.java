package practice;


//Define the structure of a node in the linked list
class ListNode {
	int data;
	ListNode next;

	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

//Singly Linked List class
class SinglyLinkedList {
	private ListNode head;

	// Add a new node at the end of the list
	public void add(int data) {
		ListNode newNode = new ListNode(data);

		if (head == null) {
			head = newNode;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	// Remove a node with a specific value
	public void remove(int data) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (head.data == data) {
			head = head.next;
			return;
		}

		ListNode current = head;
		while (current.next != null && current.next.data != data) {
			current = current.next;
		}

		if (current.next == null) {
			System.out.println("Node with value " + data + " not found");
		} else {
			current.next = current.next.next;
		}
	}

	// Display all nodes in the list
	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}

//Test the SinglyLinkedList
public class LinkedListTest {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        System.out.println("Original List:");
        list.printList();

        list.reverse();
        
        System.out.println("Reversed List:");
        list.printList();
    }
}
