
public class Listmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SList<String> s = new SList<String>();
		s.insertFront("orange"); s.insertFront("apple");
		s.insetAfter("cherry", s.head.getNext());
		s.insertFront("pear");
		
		s.print();
		System.out.println(": s의 길이=" + s.size()+"\n");
		System.out.println("체리가 \t"+s.search("cherry")+"번째에 있다.");
		System.out.println("키위가\t"+s.search("kiwi")+"번째에 있다.\n");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s의 길이= "+ s.size()); System.out.println();
		s.deleteFront();
		s.print();
		System.out.println(": s의 길이= "+ s.size()); System.out.println();
		
		SList<Integer> t = new SList<Integer>();
		t.insertFront(500); t.insertFront(200);
		t.insetAfter(400, t.head);
		t.insertFront(100);
		t.insetAfter(300, t.head.getNext());
		t.print();
		System.out.println(": t의 길이 = " + t.size());
	}

}
