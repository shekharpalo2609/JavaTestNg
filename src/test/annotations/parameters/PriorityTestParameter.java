//Set the priority of the test annotations. Where 0 is the default priority

package test.annotations.parameters;

import org.testng.annotations.Test;

public class PriorityTestParameter {

	@Test(priority = 3)
	void signUp() {
		System.out.println("Sign up");
	}
	
	@Test(priority = 1)
	void launch() {
		System.out.println("Launch");
	}
	
	@Test(priority = 8)
	void login() {
		System.out.println("Login");
	}
	
	@Test(priority = 8)
	void logout() {
		System.out.println("Logout");
	}
}
