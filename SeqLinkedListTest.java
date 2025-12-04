import java.util.Random;
public class SeqLinkedListTest {
	public static void main(String[] args)
	{
		LinkedList<Double> list = new LinkedList<>();
		
		
		Random rand = new Random();
        double n = 100000;
        
        int numTrials = 10;
        double totalTime = 0;
        double duration;
        
     // Fill list with 1000 integers
        for (double i = 0; i < n; i++)
        {
            list.add(i);
        }
        
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
