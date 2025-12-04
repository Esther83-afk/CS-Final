

public class SeqArrayListTest {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		
        double n = 500000;
        
        int numTrials = 10;
        double totalTime = 0;
        double duration;
        
     // Fill list with 500000 integers
        for (int i = 0; i < n; i++)
        {
            list.add(i);
        }
        
     // Run sequential access 10 times
        for (int t = 1; t <= numTrials; t++) 
        {
        	
	        double start = System.nanoTime();
	        for (int i = 0; i < list.size(); i++)
	        {
	            list.get(i);
	        }
	        double end = System.nanoTime();

	         duration = end - start;
	        totalTime += duration;
	        
	        System.out.println("Trial " + t + ": " + duration + " ns");
        }
        
        double averageTime1 = totalTime / numTrials;
        System.out.println(averageTime1);
 
    }
}
