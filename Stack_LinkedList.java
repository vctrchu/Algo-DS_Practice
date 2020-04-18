public class StackUsingLinkedList {
	
	private class Node {
		int data;
		Node next;
	}

	Node top;

	StackUsingLinkedList() {
		this.top = null;
	}

	private void push(int value) {
		Node temp = new Node();
		temp.data = value;
		temp.next = top;
		top = temp;
	}

	private int pop() {
		if (isEmpty) {
			return -1;
		} else {
			top = top.next;
		}
	}

	private boolean isEmpty() {
		return top == null;
	}

	private int peek() {
		if (isEmpty) {
			return -1;
		} else {
			return top.data;
		}
	}

}