package ryan1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api
import org.junit.jupiter.api.Test;

class FibMavenText {
	
	int fibTest;
	int fibCompare;

	@Test
	public void test() {
		
		FibMaven test = new FibMaven();
		fibTest = test.fibRecursionMethod(10);
		fibCompare = test.fibRecursionMethod(12);
		
		assertEquals(fibTest, fibCompare);
	}
	
	@Test
	public void test1() {
		
		FibMaven test = new FibMaven();
		fibTest = test.fibRecursionMethod(10);
		fibCompare = test.fibRecursionMethod(10);
		
		assertEquals(fibTest, fibCompare);
	}

}
