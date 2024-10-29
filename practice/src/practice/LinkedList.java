package practice;

//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class LinkedList {

	// Method to find the middle of the linked list
	public ListNode findMiddle(ListNode head) {
		if (head == null) {
			return null; // Return null if the list is empty
		}

		ListNode slow = head; // This pointer moves one step at a time
		ListNode fast = head; // This pointer moves two steps at a time

		// Traverse the list until the fast pointer reaches the end
		while (fast != null && fast.next != null) {
			slow = slow.next; // Move slow pointer by 1
			fast = fast.next.next; // Move fast pointer by 2
		}

		return slow; // When fast pointer reaches the end, slow pointer is at the middle
	}

	// Helper method to create a linked list from an array
	public ListNode createLinkedList(int[] values) {
		if (values.length == 0) {
			return null;
		}

		ListNode head = new ListNode(values[0]);
		ListNode current = head;
		for (int i = 1; i < values.length; i++) {
			current.next = new ListNode(values[i]);
			current = current.next;
		}

		return head;
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		// Create a linked list with values
		int[] values = { 1, 2, 3, 4, 5 };
		ListNode head = linkedList.createLinkedList(values);

		// Find the middle of the linked list
		ListNode middle = linkedList.findMiddle(head);

		if (middle != null) {
			System.out.println("The middle node value is: " + middle.val);
		} else {
			System.out.println("The linked list is empty.");
		}
	}
}
