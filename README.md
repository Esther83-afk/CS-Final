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
        //finally return saved element from ln 28
        return removedElement;
    }
    public  T get()
    {
    }
    public int size()
    {
      return size;
    }
    
}
