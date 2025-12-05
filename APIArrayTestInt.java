package Project1;

import java.util.ArrayList;

public class APIArrayTestInt {
    public static void main(String[] args) {
        //config
        int n = 500000; //size
        int ops = 1000; //# of elements to remove
        System.out.println("Testing Java API ArrayList (Integer) (Size: " + n + ") - Removing " + ops + " elements");

        //test beginning
        ArrayList<Integer> listStart = fillList(n);
        long t1 = System.nanoTime();
        
        for (int i = 0; i < ops; i++) {
            listStart.remove(0);
        }  
        System.out.println("Beginning: " + (System.nanoTime() - t1) + " ns");

        //middle
        ArrayList<Integer> listMid = fillList(n);
        long t2 = System.nanoTime(); 
        for (int i = 0; i < ops; i++) {
            listMid.remove(listMid.size() / 2);
        }
        System.out.println("Middle:    " + (System.nanoTime() - t2) + " ns");

        //end
        ArrayList<Integer> listEnd = fillList(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) {
            //remove last index
            listEnd.remove(listEnd.size() - 1);
        }
        System.out.println("End:       " + (System.nanoTime() - t3) + " ns");
    }

    //helper to make list with data
    public static ArrayList<Integer> fillList(int size) {
        ArrayList<Integer> list = new ArrayList<>(); 
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }
}