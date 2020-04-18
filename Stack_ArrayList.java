public class StackUsingArrayList {
	List<Integer> stackList;

	StackUsingArrayList() {
		stackList = new ArrayList<>();
	}

	private void push(int value) {
		stackList.add(value);
	}

	private int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			int popValue = stackList.get(stackList.size() - 1);
			stackList.remove(stackList.get(stackList.size - 1));
			return popValue;
		}
	}

	private boolean isEmpty() {
		return stackList.isEmpty();
	}

	private int peek() {
		if (isEmpty()) return -1;
		else {
			return stackList.get(stackList.size() - 1);
		}
	}

	public static void main(String[] args) {
		Stack newStack = new Stack();
		newStack.push(1);
		newStack.push(2);
		newStack.pop();
		newStack.isEmpty();
		newStack.peek()


		/*
			2
			false
			1

		*/
	}

}