
public class FasterFunctions {
	public static void main(String[] args) {
		//Your Code Here
		
		
		Thread t1 = new Thread(()->{
			float endTime = 0;
			float totalTime = 0;
			long startTime = System.currentTimeMillis();
			System.out.println("Starting slowSortLargeArray()...");
			SlowFunctions.slowSortLargeArray();
			System.out.println("slowSortLargeArray() Complete.");
			endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
			totalTime += endTime;
			System.out.println("slowSortLargeArray() Time: " + endTime + "\n\n");
			
		});
		Thread t2 = new Thread(()->{
			float endTime = 0;
			float totalTime = 0;
			long startTime = System.currentTimeMillis();
			startTime = System.currentTimeMillis();
			System.out.println("Starting ackermann(3, 14)...");
			System.out.println("ackermann(3, 14): " + SlowFunctions.ackermann(3, 14));
			System.out.println("ackermann(3, 14) Complete.");
			endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
			totalTime += endTime;
			System.out.println("ackerman(3, 14) Time: " + endTime + "\n\n");
			
		});
		Thread t3 = new Thread(()->{
			float endTime = 0;
			float totalTime = 0;
			long startTime = System.currentTimeMillis();
			System.out.println("Starting millionsOfSqrts()...");
			SlowFunctions.millionsOfSqrts();
			System.out.println("millionsOfSqrts() Complete.");
			endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
			totalTime += endTime;
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		//endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
		//totalTime += endTime;
		//System.out.println("Total Time: " + totalTime);
	}
}
