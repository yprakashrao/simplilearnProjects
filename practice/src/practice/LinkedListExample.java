package practice;

//Define the structure of a node in the linked list
class NodeElement {
	int value;
	NodeElement nextNode;

	public NodeElement(int value) {
		this.value = value;
		this.nextNode = null;
	}
}

//Simple Linked List class
class SimpleLinkedList {
	private NodeElement startNode;

	// Add a new node at the end of the list
	public void add(int value) {
		NodeElement newNode = new NodeElement(value);

		if (startNode == null) {
			startNode = newNode;
		} else {
			NodeElement current = startNode;
			while (current.nextNode != null) {
				current = current.nextNode;
			}
			current.nextNode = newNode;
		}
	}

	// Reverse the linked list
	public void reverse() {
		NodeElement previousNode = null;
		NodeElement currentNode = startNode;
		NodeElement followingNode;

		while (currentNode != null) {
			followingNode = currentNode.nextNode; // Temporarily store the next node
			currentNode.nextNode = previousNode; // Reverse the current node's pointer
			previousNode = currentNode; // Move previous to current
			currentNode = followingNode; // Move to the next node in the original list
		}

		startNode = previousNode; // Update startNode to the new first node
	}

	// Display all nodes in the list
	public void printList() {
		if (startNode == null) {
			System.out.println("List is empty");
			return;
		}

		NodeElement current = startNode;
		while (current != null) {
			System.out.print(current.value + " -> ");
			current = current.nextNode;
		}
		System.out.println("null");
	}
}

//Test the SimpleLinkedList
public class LinkedListExample {
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
