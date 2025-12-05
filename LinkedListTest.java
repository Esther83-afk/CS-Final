import java.util.Random;

public class LinkedListTest
{

	public static void main(String[] args)
	{
		//Test for double
		LinkedList<Double> list = new LinkedList<>();
		
		Random rand = new Random();
        int n = 500000;
        
        int numTrials = 10;
        double totalTime = 0;
        double duration;
        
     // Fill list with 50000 integers
        for (double i = 0; i < n; i++)
        {
            list.add(i);
        }
        
     // Measure random access time
        
     for (int t = 1; t <= numTrials; t++) 
        {
        	
	        double start = System.nanoTime();
	        for (int i = 0; i < 100; i++)
	        {
	            int index = rand.nextInt(n); // random index between 0 and 999
	            list.get(index);
	        }
	        double end = System.nanoTime();

	         duration = end - start;
	        totalTime += duration;
	        
	        System.out.println("Trial " + t + ": " + duration + " ns");
        }
        
        double averageTime = totalTime / numTrials;
        System.out.println(averageTime);
        
        //Test for Integer 
        LinkedList<Integer> list1 = new LinkedList<>();
        
        n = 500000;
        
         numTrials = 10;
         totalTime = 0;
       
        
     // Fill list with 500000 integers
        for (int i = 0; i < n; i++)
        {
            list1.add(i);
        }
        
     // Measure random access time
        
     for (int t = 1; t <= numTrials; t++) 
        {
        	
	        double start = System.nanoTime();
	        for (int i = 0; i < 100; i++)
	        {
	            int index = rand.nextInt(n); // random index between 0 and 999
	            list1.get(index);
	        }
	        double end = System.nanoTime();

	         duration = end - start;
	        totalTime += duration;
	        
	        System.out.println("Trial " + t + ": " + duration + " ns");
        }
     	
	     averageTime = totalTime / numTrials;
	     System.out.println(averageTime);
        
	} 

}

