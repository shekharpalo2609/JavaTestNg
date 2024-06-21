package grouping.basic;

import org.testng.annotations.Test;

public class GroupingWithExcludeTag {

	@Test(groups = { "smoke" })
	public void test1() {
		System.out.println("Smoke Tesing 1");
	}
	
	@Test(groups = { "smoke" })
	public void test2() {
		System.out.println("Smoke Tesing 2");
	}
	
	@Test(groups = { "smoke" })
	public void test3() {
		System.out.println("Smoke Tesing 3");
	}
	
	@Test(groups = { "smoke" })
	public void test4() {
		System.out.println("Smoke Tesing 4");
	}
	
	@Test(groups = { "smoke" })
	public void test5() {
		System.out.println("Smoke Tesing 5");
	}
	
	@Test(groups = { "smoke" })
	public void test6() {
		System.out.println("Smoke Tesing 6");
	}
	
	@Test(groups = { "smoke" })
	public void test7() {
		System.out.println("Smoke Tesing 7");
	}
	
	@Test(groups = { "smoke" })
	public void test8() {
		System.out.println("Smoke Tesing 8");
	}
	
	@Test(groups = { "smoke" })
	public void test9() {
		System.out.println("Smoke Tesing 9");
	}
	
	@Test(groups = { "smoke" })
	public void test10() {
		System.out.println("Smoke Tesing 10");
	}
	
	@Test(groups = { "system" })
	public void test11() {
		System.out.println("System Tesing 1");
	}
	@Test(groups = { "system","smoke" })
	public void test12() {
		System.out.println("Smoke and System Tesing");
	}
}
