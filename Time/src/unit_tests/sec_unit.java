package unit_tests;

import static org.junit.Assert.*;

import org.junit.Test;
import code.Time;
public class sec_unit {

	@Test
	public void test() {
		Time time = new Time(6,45,30);
		
		double second = time.getSecond();
		
		assertEquals(30, second, 0);
	}

}
