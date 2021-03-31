import java.util.EmptyStackException;
public class ArrayStack01<E> {
	private E s[];
	private int top;
	public ArrayStack01() {
		s = (E[]) new Object[1];
		top = -1;
	}
	public int size() { return top+1;}
	public boolean isEmpty() { return (top == -1);}
	
	public E peek() {
		if (isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	
	public void push(E newItem) {
		if (size() == s.length)
			resize(2*s.length);
		s[++top] = newItem;
	}
	public E pop() {
		if (isEmpty()) throw new EmptyStackException();
		E item = s[top];
		s[top--] = null;
		if(size() > 0 && size()==s.length/4)
			resize(s.length/2);
		return item;
	}
	private void resize(int newSize) {		// 배열 크기 조절
		Object[] t = new Object[newSize];   // newSize 크기의 새로운 배열 t 생성
		for (int i = 0; i < size(); i++)
			t[i] = s[i];                    // 배열 s를 배열 t로 복사 
		s = (E[]) t;                        // 배열 t를 배열 s로 
	}
    
	public void print() { // 배열의 항목들을 출력
		if (isEmpty()) 
			System.out.print("배열이 비어있음.");      
		else
			for(int i = 0; i < s.length; i++)	System.out.print(s[i]+"\t ");
		System.out.println();
	}
}