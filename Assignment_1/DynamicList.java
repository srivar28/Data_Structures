package srivar;

public class DynamicList<E> extends ArrayList<E>{
	private int capacity;
	
	public DynamicList(int capacity) {
		super(capacity);
		this.capacity = capacity;
	}
	
	public DynamicList() {
		this(1000);
	}
	
	private void increaseArraySize(int new_size) {
		if (new_size > capacity) {
			E[] new_array = (E[]) new Object[new_size];
			for (int i = 0; i < size; i++) {
				new_array[i] = array[i];
			}
			capacity = new_size;
			array = new_array;
		}
	}
	@Override
	public void addLast(E element) {
		if (size == capacity) { 
			increaseArraySize(capacity*2);		
		}
		super.addLast(element);
	}
	@Override
	public void addFirst(E element) {
		if (size >= capacity) { 
			increaseArraySize(capacity*2);				
		}
		super.addFirst(element);
	}
	public static void main(String[] args) {
		DynamicList<Integer> test = new DynamicList<Integer>(2);
		for (int i = 1; i <= 20; i++) {
			test.addLast(i);
		}
		System.out.print("Capacity: " + test.capacity);
	}
}
