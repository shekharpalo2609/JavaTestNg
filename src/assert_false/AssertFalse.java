package assert_false;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {

	@Test
	public void test1() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2() {
		Assert.assertFalse(true);
	}
}
