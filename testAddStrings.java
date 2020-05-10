package JUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitTesting junitString = new JUnitTesting();
		String result = junitString.addStrings("Counter","Strike");
		assertEquals("CounterStrike",result);
		
	}

}
