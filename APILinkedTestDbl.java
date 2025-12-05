package Project1;

import java.util.LinkedList;

public class APILinkedTestDbl {
    public static void main(String[] args) {
        //config
        int n = 500000; //size
        int ops = 1000; //# of elements to remove
        System.out.println("Testing Java API LinkedList (Double) (Size: " + n + ") - Removing " + ops + " elements");

        //test beginning
        LinkedList<Double> listStart = fillList(n);
        long t1 = System.nanoTime();
        
        for (int i = 0; i < ops; i++) {
            listStart.remove(0);
        }  
        System.out.println("Beginning: " + (System.nanoTime() - t1) + " ns");

        //middle
        LinkedList<Double> listMid = fillList(n);
        long t2 = System.nanoTime(); 
        for (int i = 0; i < ops; i++) {
            listMid.remove(listMid.size() / 2);
        }
        System.out.println("Middle:    " + (System.nanoTime() - t2) + " ns");

        //end
        LinkedList<Double> listEnd = fillList(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) {
            //remove last index
            listEnd.remove(listEnd.size() - 1);
        }
        System.out.println("End:       " + (System.nanoTime() - t3) + " ns");
    }

    //helper to make list with data
    public static LinkedList<Double> fillList(int size) {
        LinkedList<Double> list = new LinkedList<>(); 
        for (int i = 0; i < size; i++) {
            list.add((double) i); //cast int to double
        }
        return list;
    }
}