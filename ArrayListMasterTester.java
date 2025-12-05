package Project1;

public class ArrayListMasterTester {

    public static void main(String[] args) {
        //config
        int n = 500000; //size 
        int ops = 1000; //# of elements to remove
        System.out.println("====== JAVA API ARRAYLIST TESTS ======");
        runAPITestInt(n, ops);
        runAPITestDbl(n, ops);
        System.out.println("\n====== CUSTOM ARRAYLIST TESTS ======");
        runCustomTestInt(n, ops); 
        runCustomTestDbl(n, ops); 
    }

    //test api int
    public static void runAPITestInt(int n, int ops) {
        System.out.println("API (Integer) (Size: " + n + ")");
        
        //beginning
        java.util.ArrayList<Integer> listStart = fillListAPIInt(n);
        long t1 = System.nanoTime();
        for (int i = 0; i < ops; i++) listStart.remove(0);
        System.out.println("  Beginning: " + (System.nanoTime() - t1) + " ns");

        //middle
        java.util.ArrayList<Integer> listMid = fillListAPIInt(n);
        long t2 = System.nanoTime();
        for (int i = 0; i < ops; i++) listMid.remove(listMid.size() / 2);
        System.out.println("  Middle:    " + (System.nanoTime() - t2) + " ns");

        //end
        java.util.ArrayList<Integer> listEnd = fillListAPIInt(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) listEnd.remove(listEnd.size() - 1);
        System.out.println("  End:       " + (System.nanoTime() - t3) + " ns");
    }

    //test api double
    public static void runAPITestDbl(int n, int ops) {
        System.out.println("API (Double)  (Size: " + n + ")");
        
        //beginning
        java.util.ArrayList<Double> listStart = fillListAPIDbl(n);
        long t1 = System.nanoTime();
        for (int i = 0; i < ops; i++) listStart.remove(0);
        System.out.println("  Beginning: " + (System.nanoTime() - t1) + " ns");
        
        //middle
        java.util.ArrayList<Double> listMid = fillListAPIDbl(n);
        long t2 = System.nanoTime();
        for (int i = 0; i < ops; i++) listMid.remove(listMid.size() / 2);
        System.out.println("  Middle:    " + (System.nanoTime() - t2) + " ns");
        
        //end
        java.util.ArrayList<Double> listEnd = fillListAPIDbl(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) listEnd.remove(listEnd.size() - 1);
        System.out.println("  End:       " + (System.nanoTime() - t3) + " ns");
    }

    //custom int
    public static void runCustomTestInt(int n, int ops) {
        System.out.println("CUSTOM (Integer) (Size: " + n + ")");
        
        //beginning
        ArrayList<Integer> listStart = fillListCustomInt(n); 
        long t1 = System.nanoTime();
        for (int i = 0; i < ops; i++) listStart.remove(0);
        System.out.println("  Beginning: " + (System.nanoTime() - t1) + " ns");

        //middle
        ArrayList<Integer> listMid = fillListCustomInt(n);
        long t2 = System.nanoTime();
        for (int i = 0; i < ops; i++) listMid.remove(listMid.size() / 2);
        System.out.println("  Middle:    " + (System.nanoTime() - t2) + " ns");

        //end
        ArrayList<Integer> listEnd = fillListCustomInt(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) listEnd.remove(listEnd.size() - 1);
        System.out.println("  End:       " + (System.nanoTime() - t3) + " ns");
    }

    //custom dbl
    public static void runCustomTestDbl(int n, int ops) {
        System.out.println("CUSTOM (Double)  (Size: " + n + ")");
        
        //beginning
        ArrayList<Double> listStart = fillListCustomDbl(n);
        long t1 = System.nanoTime();
        for (int i = 0; i < ops; i++) listStart.remove(0);
        System.out.println("  Beginning: " + (System.nanoTime() - t1) + " ns");

        //middle
        ArrayList<Double> listMid = fillListCustomDbl(n);
        long t2 = System.nanoTime();
        for (int i = 0; i < ops; i++) listMid.remove(listMid.size() / 2);
        System.out.println("  Middle:    " + (System.nanoTime() - t2) + " ns");

        //end
        ArrayList<Double> listEnd = fillListCustomDbl(n);
        long t3 = System.nanoTime();
        for (int i = 0; i < ops; i++) listEnd.remove(listEnd.size() - 1);
        System.out.println("  End:       " + (System.nanoTime() - t3) + " ns");
    }

    //helpers api
    public static java.util.ArrayList<Integer> fillListAPIInt(int size) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        for (int i = 0; i < size; i++) list.add(i);
        return list;
    }
    public static java.util.ArrayList<Double> fillListAPIDbl(int size) {
        java.util.ArrayList<Double> list = new java.util.ArrayList<>();
        for (int i = 0; i < size; i++) list.add((double)i);
        return list;
    }

    //custom helpers
    public static ArrayList<Integer> fillListCustomInt(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) list.add(i);
        return list;
    }
    public static ArrayList<Double> fillListCustomDbl(int size) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < size; i++) list.add((double)i);
        return list;
    }
}