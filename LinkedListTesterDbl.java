package Project1;

public class LinkedListTesterDbl {
    public static void main(String[] args) {
        //test size
        int n = 500000; 
        System.out.println("Testing LinkedList (Double) (Size: " + n + ")");

        //test beginning
        LinkedList<Double> listStart = fillList(n);
        long t1 = System.nanoTime();
        listStart.remove(0);
        System.out.println("Beginning: " + (System.nanoTime() - t1) + " ns");

        //test middle
        LinkedList<Double> listMid = fillList(n);
        long t2 = System.nanoTime();
        listMid.remove(n / 2);
        System.out.println("Middle:    " + (System.nanoTime() - t2) + " ns");

        //test end
        LinkedList<Double> listEnd = fillList(n);
        long t3 = System.nanoTime();
        listEnd.remove(n - 1);
        System.out.println("End:       " + (System.nanoTime() - t3) + " ns");
    }

    //helper to make list with data
    public static LinkedList<Double> fillList(int size) {
        LinkedList<Double> list = new LinkedList<>(); 
        for (int i = 0; i < size; i++) {
            list.add((double)i);
        }
        return list;
    }
}