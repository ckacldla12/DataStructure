public class list_Stack {
	public static void main(String[] args) {
		ListStack<String> stack = new ListStack<String>();
		stack.push("apple"); stack.push("orange"); stack.push("cheery");
		System.out.println(stack.peek());
		stack.push("pear"); stack.print();
		stack.pop(); System.out.println(stack.peek());
		stack.push("grape"); stack.print();
	}
}
