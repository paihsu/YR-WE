package base;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CaloriAllowanceTest {
	
	
	@Test
	public void TestCaloriAllow(){
		CaloriAllowance cal = new CaloriAllowance();
		assertTrue((int)cal.calculate("100","50", "33") == 969);
	}
}
