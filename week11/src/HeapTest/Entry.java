package HeapTest;

public class Entry<Key extends Comparable<Key>, Value> {
	private Key ky;
	private Value val;

	public Entry(Key newKey, Value newValue) {// 생성자
		ky = newKey;
		val = newValue;
	}

	// get메소드 set메소드들
	public Key getKey() {
		return ky;
	}

	public Value getValue() {
		return val;
	}

	public void setKey(Key newKey) {
		ky = newKey;
	}

	public void setValue(Value newValue) {
		val = newValue;
	}

}