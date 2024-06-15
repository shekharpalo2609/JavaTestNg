package test_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTypes {

	@BeforeSuite
	void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	void afterSuite() {
		System.out.println("After Suite");
	}

	@Test
	void test2() {
		System.out.println("Test 2");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	void afterTest() {
		System.out.println("After Test");
	}

	@BeforeClass
	void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	void afterClass() {
		System.out.println("After Class");
	}

	@BeforeMethod
	void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	void afterMethod() {
		System.out.println("After Method");
	}

	@Test
	void test1() {
		System.out.println("Test 1");
	}

}
