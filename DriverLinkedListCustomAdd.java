package finalCSProject;

public class DriverLinkedListCustomAdd {

    LinkedList<Integer> listInt = new LinkedList<>();
    LinkedList<Double> listDouble = new LinkedList<>();
        
    int numberOfRuns;
    int sizeOfList;
    int numberOfInsertions;
    long start;
    long total = 0;
    long addTotal = 0;
    long totalAvg;
    int index;

    public void loadList(String listType){
        if (listType=="Integer"){
            for (int i = 0; i < sizeOfList; i++) {
                listInt.add(i); //Integer
            }
        }
        else if (listType=="Double"){
            for (double i = 0.0; i < sizeOfList; i++) {
                listDouble.add(i); //double
            }
        }
        else {System.out.println("List type needs to be Integer or Double");}
    }
   
    public void runIntegerInsertionTest(String insertionLocation,int sizeOfList){
        this.sizeOfList=sizeOfList;
        for (int r = 0; r < numberOfRuns; r++) {
            loadList("Integer");
            // TEST 1: Insert at Start (Average)
            if(insertionLocation=="Start"){
                index = 0;            
            } else if(insertionLocation=="Middle"){
                index=listInt.size()/2;
            } else{
                index=listInt.size();
            }
            start = System.nanoTime();
            for (int i = 0; i < numberOfInsertions; i++) {
                listInt.add(index+i, i);
            }
            total = (System.nanoTime() - start);
            addTotal=total+addTotal;
            System.out.println("Insertion Integers at " + insertionLocation + " of LinkedListCustom with size of " + sizeOfList + " Run " + r + " Total Time: " + total + " ns");

            listInt.clear(); //clear for next time test
        }
        totalAvg = addTotal / numberOfRuns;
        System.out.println("Total " + numberOfRuns + " runs with Total Avg time: " + totalAvg + " ns");
        addTotal=0;  //set total back to 0
    }
    public void runDoubleInsertionTest(String insertionLocation, int sizeOfList){
        this.sizeOfList=sizeOfList;
        for (int r = 0; r < numberOfRuns; r++) {
            loadList("Double");
            // TEST 1: Insert at Start (Average)
            if(insertionLocation=="Start"){
                index = 0;            
            } else if(insertionLocation=="Middle"){
                index=listDouble.size()/2;
            } else{
                index=listDouble.size();
            }
            start = System.nanoTime();
            for (double i = 0.0; i < numberOfInsertions; i++) {
                listDouble.add(index+(int)i, i);
            }
            total = (System.nanoTime() - start);
            addTotal=total+addTotal;
            System.out.println("Insertion of Doubles at " + insertionLocation + " of LinkedListCustom with size of " + sizeOfList + " Run " + r + " Total Time: " + total + " ns");

            listDouble.clear(); //clear for next time test
        }
        totalAvg = addTotal / numberOfRuns;
        System.out.println("Total " + numberOfRuns + " runs with Total Avg time: " + totalAvg + " ns");
        addTotal=0;  //set total back to 0
    }	
    public static void main(String[] args) {
        //Test Insertions for List sizes of 10_000, 50_000, 100_000, 300_000, 500_000
    	//Run Start of list Insertions
        //10000
        DriverLinkedListCustomAdd testIntList = new DriverLinkedListCustomAdd();
        testIntList.numberOfRuns=5;
        testIntList.numberOfInsertions=1000;
        testIntList.runIntegerInsertionTest("Start",10000);
 	
        //20000
        testIntList.runIntegerInsertionTest("Start",20000);        

        //50000
        testIntList.runIntegerInsertionTest("Start", 50000);        

        //100000
        //testIntList.runIntegerInsertionTest("Start", 100000);  

        //300000
        //testIntList.runIntegerInsertionTest("Start", 300000);  

        //500000
        //testIntList.runIntegerInsertionTest("Start",500000);  

        //Run Double DataType insertion test
        DriverLinkedListCustomAdd testDoubleList = new DriverLinkedListCustomAdd();
        testDoubleList.numberOfRuns=5;
        testDoubleList.numberOfInsertions=1000;
        testDoubleList.runDoubleInsertionTest("Start", 10000);
    	
        //20000
        testDoubleList.runDoubleInsertionTest("Start",20000);        

        //50000
        testDoubleList.runDoubleInsertionTest("Start",50000);        

        //100000
        //testDoubleList.runDoubleInsertionTest("Start",100000);  

        //300000
        //testDoubleList.runDoubleInsertionTest("Start",300000);  

        //500000
        //testDoubleList.runDoubleInsertionTest("Start",500000);  

        //Run Middle Insertion
        testIntList.runIntegerInsertionTest("Middle",10000);
    	
        //20000
        testIntList.runIntegerInsertionTest("Middle",20000);        

        //50000
        testIntList.runIntegerInsertionTest("Middle",50000);        

        //100000
        //testIntList.runIntegerInsertionTest("Middle",100000);  

        //300000
        //testIntList.runIntegerInsertionTest("Middle",300000);  

        //500000
        //testIntList.runIntegerInsertionTest("Middle",500000);  

        //Run Middle Insertion Double
        testDoubleList.runDoubleInsertionTest("Middle",10000);

    	
        //20000
        testDoubleList.runDoubleInsertionTest("Middle",20000);        

        //50000
        testDoubleList.runDoubleInsertionTest("Middle",50000);        

        //100000
        //testDoubleList.runDoubleInsertionTest("Middle",100000);  

        //300000
        //testDoubleList.runDoubleInsertionTest("Middle",300000);  

        //500000
        //testDoubleList.runDoubleInsertionTest("Middle",500000); 

        //Run End Insertion
        testIntList.runIntegerInsertionTest("End",10000);
    	
        //20000
        testIntList.runIntegerInsertionTest("End",20000);        

        //50000
        testIntList.runIntegerInsertionTest("End", 50000);        

        //100000
        //testIntList.runIntegerInsertionTest("End",10000);  

        //300000
        //testIntList.runIntegerInsertionTest("End",300000);  

        //500000
        //testIntList.runIntegerInsertionTest("End",500000);  

        //Run Middle Insertion Double
        testDoubleList.runDoubleInsertionTest("End",10000);
    	//System.exit(0);
    	
        //20000
        testDoubleList.runDoubleInsertionTest("End",20000);        

        //50000
        testDoubleList.runDoubleInsertionTest("End",50000);        

        //100000
        //testDoubleList.runDoubleInsertionTest("End",100000);  

        //300000
        //testDoubleList.runDoubleInsertionTest("End",300000);  

        //500000
        //testDoubleList.runDoubleInsertionTest("End",500000); 
    }

}

