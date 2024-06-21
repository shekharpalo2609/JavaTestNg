package dataProvider.basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Basic {

	@DataProvider(name = "data1")
	public Object[][] method1() {

		return new Object[][] { { "Java" }, { "C" }, { "C#" }, { "C++" } };
	}
	
	@DataProvider(name = "data2")
	public Object[][] method2() {

		return new Object[][] { { 10 }, { 20 }, { 30 }, { 40 } };
	}

	@Test(dataProvider = "data1")
	public void test1(String language) {
		System.out.println(language.concat(" program"));
	}
	
	@Test(dataProvider = "data2")
	public void test2(int id) {
		System.out.println(id + "");
	}
}