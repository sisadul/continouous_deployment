

public class Driver {

	public static void main(String[] args) {
		// This is a simple driver class to demonstrate the functionality of the Counter class. It will create a Counter object, print the current count, increment the count, print the current count again, decrement the count, and print the current count one last time.
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
