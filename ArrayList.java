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
    public void add(T element) {
            if (size >= data.length) {
                resize();
            }
            data[size] = element;
            size++;
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
    /**
     *removes element at given point
     *shifts any previous elements to the left
     */
    public T remove(int index) {
        //check if index is valid, and check against size.
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        //store removed element to return later
        T removedElement = data[index];
        //shift elements to left, starting from removed index
        for (int i = index; i < size - 1; i++) {
            // Copy the element from the right (i + 1) into the current spot (i)
            data[i] = data[i + 1];
        }
        //decrement size
        size--;
        //clean up
        data[size] = null;
        return removedElement;
    }

}

