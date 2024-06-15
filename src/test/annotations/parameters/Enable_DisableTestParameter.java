//by default enabled are true
package test.annotations.parameters;

import org.testng.annotations.Test;

public class Enable_DisableTestParameter {

	@Test(enabled = true)
	void signUp() {
		System.out.println("Sign up");
	}
	
	@Test(priority = 1,enabled = true)
	void launch() {
		System.out.println("Launch");
	}
	
	@Test(priority = 8)
	void login() {
		System.out.println("Login");
	}
	
	@Test(priority = 8,enabled = false)
	void logout() {
		System.out.println("Logout");
	}
	
}
