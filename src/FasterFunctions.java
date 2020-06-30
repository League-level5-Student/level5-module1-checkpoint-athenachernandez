
public class FasterFunctions {
	public static void main(String[] args) {
		float totalTime = 0;
		long startTime = System.currentTimeMillis();
		//Your Code Here
		
		Thread t1 = new Thread(()->System.currentTimeMillis());
		Thread t2 = new Thread(()->System.currentTimeMillis());
		Thread t3 = new Thread(()->System.currentTimeMillis());
		
		float endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
		totalTime += endTime;
		System.out.println("Total Time: " + totalTime);
	}
}
