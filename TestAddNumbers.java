package JUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		JUnitTesting junit = new JUnitTesting();
		int result = junit.addNumbers(250,750);
		
		assertEquals(1000,result);
	}
	}
