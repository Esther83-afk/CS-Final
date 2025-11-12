public class LinkedList <T> {
	
	private Node <T> head;
	private int size;
	private Node <T> tail;
	
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
		return size;
	}
	
	public void add(T element) {
		        Node<T> newNode = new Node<>(element);
		        if (head == null) {
		            head = tail = newNode;
		        } else {
		            tail.next = newNode;
		            tail = newNode;
		        }
		        size++;
		    }

		    // Adds element at a given index
		    public void add(int index, T element) {
		        if (index < 0 || index > size) {
		            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		        }

		        Node<T> newNode = new Node<>(element);

		        if (index == 0) {
		            newNode.next = head;
		            head = newNode;
		            if (tail == null) tail = newNode; // first element
		        } else if (index == size) {
		            tail.next = newNode;
		            tail = newNode;
		        } else {
		            Node<T> prev = head;
		            for (int i = 0; i < index - 1; i++) {
		                prev = prev.next;
		            }
		            newNode.next = prev.next;
		            prev.next = newNode;
		        }
		        size++;
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
