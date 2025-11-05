public class LinkedList <T> {
	
	private Node <T> head;
	private int size;
	
	public static class Node<T> {
		T data;
		Node <T> next;
		
		Node (T data) {
			this.data = data;
			this.next = null;
		}
	}
	public LinkedList() {
		head = null;
		size = 0;
		
	}
	
	public int size() {
		
	}
	
	public void add(T element) {
		
	}
	
	// get() method
	public T get(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		
		Node <T> current = head;
		for( int i = 0; i < index; i++) {
			current = current.next;
		}
		
		return current.data;
		
	}
	
	public T remove(int index) {
		
	}
	
}
