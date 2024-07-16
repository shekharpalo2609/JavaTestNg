package assertDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {

	@Test
	public void test1() 
	{
	//Assert.assertEquals(false, true);
	//	Assert.assertEquals(false, false, "Sorry but conditions are not matching");
	Assert.assertEquals(11, 90,"TC failed");
	
	
	}
}
