package unit_tests;

import static org.junit.Assert.*;

import org.junit.Test;
import code.Time;
public class min_unit {

	@Test
	public void test() {
		Time time = new Time(6,45,30);
		
		int minute = time.getMinute();
		
		assertEquals(45, minute);
	}

}
