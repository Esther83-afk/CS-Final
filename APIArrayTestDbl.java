package Project1;

import java.util.ArrayList;
public class APIArrayTestDbl {
    public static void main(String[] args) {
        //config
        int n = 500000; //size
        int ops = 1000; //# elements removed
        System.out.println("Testing Java API ArrayList (Double) (Size: " + n + ") - Removing " + ops + " elements");

        //test start
        ArrayList<Double> listStart = fillList(n);
        long t1 = System.nanoTime();
        for (int i = 0; i < ops; i++) {
            listStart.remove(0);
        }  
        System.out.println("Beginning: " + (System.nanoTime() - t1) + " ns");

        //middle
        ArrayList<Double> listMid = fillList(n);
        long t2 = System.nanoTime(); 
        for (int i = 0; i < ops; i++) {
            listMid.remove(listMid.size() / 2);
        }
        System.out.println("Middle:    " + (System.nanoTime() - t2) + " ns");

        //end
        ArrayList<Double> listEnd = fillList(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) {
            //remove last index
            listEnd.remove(listEnd.size() - 1);
        }
        System.out.println("End:       " + (System.nanoTime() - t3) + " ns");
    }

    //helper to make list with data
    public static ArrayList<Double> fillList(int size) {
        ArrayList<Double> list = new ArrayList<>(); 
        for (int i = 0; i < size; i++) {
            list.add((double)i);
        }
        return list;
    }
}