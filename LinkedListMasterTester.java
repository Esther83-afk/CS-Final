package Project1;

public class LinkedListMasterTester {

    public static void main(String[] args) {
        //config
        int n = 500000; //size 
        int ops = 1000; //# of elements to remove
        
        System.out.println("====== JAVA API LINKEDLIST TESTS ======");
        runAPITestInt(n, ops);
        runAPITestDbl(n, ops);
        
        System.out.println("\n====== CUSTOM LINKEDLIST TESTS ======");
        runCustomTestInt(n, ops); 
        runCustomTestDbl(n, ops); 
    }

    //test api int
    public static void runAPITestInt(int n, int ops) {
        System.out.println("API (Integer) (Size: " + n + ")");
        
        //beginning
        java.util.LinkedList<Integer> listStart = fillListAPIInt(n);
        long t1 = System.nanoTime();
        for (int i = 0; i < ops; i++) listStart.remove(0);
        System.out.println("  Beginning: " + (System.nanoTime() - t1) + " ns");

        //middle
        java.util.LinkedList<Integer> listMid = fillListAPIInt(n);
        long t2 = System.nanoTime();
        for (int i = 0; i < ops; i++) listMid.remove(listMid.size() / 2);
        System.out.println("  Middle:    " + (System.nanoTime() - t2) + " ns");

        //end
        java.util.LinkedList<Integer> listEnd = fillListAPIInt(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) listEnd.remove(listEnd.size() - 1);
        System.out.println("  End:       " + (System.nanoTime() - t3) + " ns");
    }

    //test api dbl
    public static void runAPITestDbl(int n, int ops) {
        System.out.println("API (Double)  (Size: " + n + ")");
        
        //beginning
        java.util.LinkedList<Double> listStart = fillListAPIDbl(n);
        long t1 = System.nanoTime();
        for (int i = 0; i < ops; i++) listStart.remove(0);
        System.out.println("  Beginning: " + (System.nanoTime() - t1) + " ns");
        
        //middle
        java.util.LinkedList<Double> listMid = fillListAPIDbl(n);
        long t2 = System.nanoTime();
        for (int i = 0; i < ops; i++) listMid.remove(listMid.size() / 2);
        System.out.println("  Middle:    " + (System.nanoTime() - t2) + " ns");
        
        //end
        java.util.LinkedList<Double> listEnd = fillListAPIDbl(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) listEnd.remove(listEnd.size() - 1);
        System.out.println("  End:       " + (System.nanoTime() - t3) + " ns");
    }

    //custom int
    public static void runCustomTestInt(int n, int ops) {
        System.out.println("CUSTOM (Integer) (Size: " + n + ")");
        
        //beginning
        LinkedList<Integer> listStart = fillListCustomInt(n); 
        long t1 = System.nanoTime();
        for (int i = 0; i < ops; i++) listStart.remove(0);
        System.out.println("  Beginning: " + (System.nanoTime() - t1) + " ns");

        //middle
        LinkedList<Integer> listMid = fillListCustomInt(n);
        long t2 = System.nanoTime();
        for (int i = 0; i < ops; i++) listMid.remove(listMid.size() / 2);
        System.out.println("  Middle:    " + (System.nanoTime() - t2) + " ns");

        //end
        LinkedList<Integer> listEnd = fillListCustomInt(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) listEnd.remove(listEnd.size() - 1);
        System.out.println("  End:       " + (System.nanoTime() - t3) + " ns");
    }

    //custom dbl
    public static void runCustomTestDbl(int n, int ops) {
        System.out.println("CUSTOM (Double)  (Size: " + n + ")");
        
        //beginning
        LinkedList<Double> listStart = fillListCustomDbl(n);
        long t1 = System.nanoTime();
        for (int i = 0; i < ops; i++) listStart.remove(0);
        System.out.println("  Beginning: " + (System.nanoTime() - t1) + " ns");

        //middle
        LinkedList<Double> listMid = fillListCustomDbl(n);
        long t2 = System.nanoTime();
        for (int i = 0; i < ops; i++) listMid.remove(listMid.size() / 2);
        System.out.println("  Middle:    " + (System.nanoTime() - t2) + " ns");

        //end
        LinkedList<Double> listEnd = fillListCustomDbl(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) listEnd.remove(listEnd.size() - 1);
        System.out.println("  End:       " + (System.nanoTime() - t3) + " ns");
    }

    //helpers api
    public static java.util.LinkedList<Integer> fillListAPIInt(int size) {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        for (int i = 0; i < size; i++) list.add(i);
        return list;
    }
    public static java.util.LinkedList<Double> fillListAPIDbl(int size) {
        java.util.LinkedList<Double> list = new java.util.LinkedList<>();
        for (int i = 0; i < size; i++) list.add((double)i);
        return list;
    }

    //helpers custom
    public static LinkedList<Integer> fillListCustomInt(int size) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) list.add(i);
        return list;
    }
    public static LinkedList<Double> fillListCustomDbl(int size) {
        LinkedList<Double> list = new LinkedList<>();
        for (int i = 0; i < size; i++) list.add((double)i);
        return list;
    }
}