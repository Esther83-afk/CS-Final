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
	if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    T removedData;

    // Case 1: Remove the head node
    if (index == 0) {
        removedData = head.data;
        head = head.next;

        // If list becomes empty, update tail as well
        if (head == null) {
            tail = null;
        }

        size--;
        return removedData;
    }

    // Case 2: Remove from middle or end
    Node<T> prev = head;

    // Traverse to the node before the one we want to remove
    for (int i = 0; i < index - 1; i++) {
        prev = prev.next;
    }

    Node<T> current = prev.next;
    removedData = current.data;

    // Skip the node
    prev.next = current.next;

    // If we removed the last node, update tail
    if (current == tail) {
        tail = prev;
    }

    size--;
    return removedData;	
	}
	//helper method to clear list
	public void clear() {
	    head = null; 
	    tail = null; 
	    size = 0;      
	}
	
}
