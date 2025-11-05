 class ArrayList<T>
 
{
    T data;
    int size = 0;

    public void add()
    {
    }
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
        //resize array if needed to save space
        if (data.length > INITIAL_CAPACITY && size < data.length / 4) {
            resize(data.length / 2);
        }
        //finally return saved element
        return removedElement;
    } 
    //helper method to resize underlying array
    private void resize(int newCapacity) {
        T[] newData = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
    public  T get()
    {
    }
    public int size()
    {
      return size;
    }
    
}
