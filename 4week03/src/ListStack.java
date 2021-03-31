import java.util.EmptyStackException;
public class ListStack<E> {
	private stackNode<E> top;
	private int size;
	public ListStack() {
		top = null;
		size = 0;
	}
	public int size() {return size;}
	public boolean isEmpty() {return size == 0;}
	public void push(E newItem) {
		stackNode newNode = new stackNode(newItem, top);
		top = newNode;
		size++;
	}
	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		return top.getItem();
	}
	public E pop() {
		if(isEmpty()) throw new EmptyStackException();
		E topItem = top.getItem();
		top = top.getNext();
		size--;
		return topItem;
	}
	public void print() {
		if(isEmpty()) System.out.print("스택이 비어있음");
		else
			for(stackNode p = top; p != null; p = p.getNext())
				System.out.println(p.getItem()+"\t");
		System.out.println();
	}
}
