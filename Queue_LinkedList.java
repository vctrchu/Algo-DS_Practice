public class QueueUsingLinkedList {
	
	// If we are using a linked list we want to create Node class
	private class Node {
		int data;
		int next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	// Keep track of front and back of queue
	Node front;
	Node rear;

	// Create constructor to initialize our front/back nodes
	QueueUsingLinkedList() {
		front = null;
		rear = null;
	}

	// Enqueue
	private void enqueue(int x) {
		Node newNode = new Node(x);
		if (front == null) {
			front = newNode;
			back = newNode;
		} else {
			rear.next = newNode; 
			rear = newNode;
		}
	}

	// Dequeue
	private int dequeue() {
		if (front == null) {
			throw new nullPointerException("No elements to dequeue")
		} else {
			int dequeueVal = front.data;
			front = front.next;
			if (front == null) {
				rear = front;
			}
		}
	}






}