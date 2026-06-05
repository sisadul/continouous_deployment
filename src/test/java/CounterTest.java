import static org.junit.Assert.*;
import org.junit.Test;

public class CounterTest {

	@Test
	public void testReset() {
		Counter testCounter = new Counter();
		
		for(int i = 0; i <10; i++) {
			testCounter.increment();
		}
		
		testCounter.reset();
		
		assertEquals(testCounter.getCount(), 0);
	}
	// This test is for the increment method, which should increase the count by 1 each time it is called. The test will call the increment method 9 times and check if the count is equal to 1, 2, ..., 9 after each call.
	@Test
	public void testIncrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i <10; i++) {
			testCounter.increment();
			assertEquals(testCounter.getCount(), i);
		}
	}
	// This test is for the decrement method, which should decrease the count by 1 each time it is called. The test will call the decrement method 9 times and check if the count is equal to -1, -2, ..., -9 after each call.
	@Test
	public void testDecrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i <10; i++) {
			testCounter.decrement();
			assertEquals(testCounter.getCount(), i * -1);
		}
	}

}
