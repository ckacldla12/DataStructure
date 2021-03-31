public class stackNode<E> {
	private E item;
	private stackNode<E> next;
	public stackNode(E newItem, stackNode<E> node) {
		item = newItem;
		next = node;
	}
	public E getItem() {return item;}
	public stackNode<E> getNext(){return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(stackNode<E> newNext) {next = newNext;}

}
