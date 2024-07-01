package skip.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkipTestCase {

	@Test()
	public void login() {
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods="login")
	public void logout() {

	}
}
