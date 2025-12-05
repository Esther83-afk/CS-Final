package Project1;

public class LinkedListTesterInt2 {
    public static void main(String[] args) {
        //test size
        int n = 10000; 
        int ops = 1000; //# of elements to remove
        System.out.println("Testing LinkedList (int) (Size: " + n + ") - Removing " + ops + " elements");

        //test beginning
        LinkedList<Integer> listStart = fillList(n);
        long t1 = System.nanoTime();
        
        for (int i = 0; i < ops; i++) {
            listStart.remove(0);
        }
        
        System.out.println("Beginning: " + (System.nanoTime() - t1) + " ns");

        //test middle
        LinkedList<Integer> listMid = fillList(n);
        long t2 = System.nanoTime();
        for (int i = 0; i < ops; i++) {
            listMid.remove(listMid.size() / 2);
        }
        System.out.println("Middle:    " + (System.nanoTime() - t2) + " ns");

        //test end
        LinkedList<Integer> listEnd = fillList(n);
        long t3 = System.nanoTime();
        
        for (int i = 0; i < ops; i++) {
            //remove the last element
            listEnd.remove(listEnd.size() - 1);
        }
        
        System.out.println("End:       " + (System.nanoTime() - t3) + " ns");
    }

    //helper to make list with data
    public static LinkedList<Integer> fillList(int size) {
        LinkedList<Integer> list = new LinkedList<>(); 
        for (int i = 0; i < size; i++) {
            list.add(i); 
        }
        return list;
    }
}