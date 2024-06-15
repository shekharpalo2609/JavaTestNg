//by default invocationCount is 1
package test.annotations.parameters;

import org.testng.annotations.Test;

public class InvocationCountTestParameter {

	@Test(priority = 3,invocationCount = 2)
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
