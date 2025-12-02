public class ArrayList<T> {

    private T[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;
     //constructs empty list with given capacity
    public ArrayList() {
        //cast obj array
        this.data = (T[]) new Object[INITIAL_CAPACITY];
        this.size = 0;
    }
    // add/get methods
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size >= data.length) resize();
        // Shift elements to the right
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }
    public void add(T element) {
        add(size, element);
    }

        public void resize() {
            T[] newData = (T[]) new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    //returns # of elements in list
    public int size() {
        return this.size;
    }

    // get method
    public T get(int index) {
    	if (index < 0 || index >= size) {
    		throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);	
    	}
    	return data[index];
    }
    
    //remove method
public T remove(int index) {
    //check if index is valid, and check against size.
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    //store removed element to return later
    T removedElement = data[index];
    //shift elements to left, starting from removed index
    for (int i = index; i < size - 1; i++) {
        //copy the element from right
        data[i] = data[i + 1];
    }
    //decrement size
    size--;
    //clean up
    data[size] = null;
    //resize array if needed to save space
    if (data.length > INITIAL_CAPACITY && size < data.length / 4) {
        resize(data.length / 2);
    }
    //finally return saved element
    return removedElement;
} 
//helper method to resize underlying array
public void resize(int newCapacity) {
    T[] newData = (T[]) new Object[newCapacity];
    for (int i = 0; i < size; i++) {
        newData[i] = data[i];
    }
    data = newData;
}
    //helper method to clear list
    public void clear() {
        data = (T[]) new Object[INITIAL_CAPACITY]; 
        size = 0;
    }
}








