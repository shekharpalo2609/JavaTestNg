package grouping.basic;

import org.testng.annotations.Test;

public class GroupingTestBasic {

	@Test(groups = { "smoke" })
	public void test1() {
		System.out.println("Smoke Tesing 1");
	}

	@Test(groups = { "system" })
	public void test2() {
		System.out.println("System Tesing 1");
	}

	@Test(groups = { "smoke" })
	public void test3() {
		System.out.println("Smoke Tesing 2");
	}

	@Test(groups = { "system" })
	public void test4() {
		System.out.println("Smoke Tesing 2");
	}

	@Test(groups = { "smoke","system" })
	public void test5() {
		System.out.println("Smoke and System Tesing 1");
	}
}
