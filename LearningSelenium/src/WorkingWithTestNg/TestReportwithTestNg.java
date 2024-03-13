package WorkingWithTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestReportwithTestNg {
	
	@Test(priority = 1)
	public void register() {
//		System.out.println("user is able to register");
		Reporter.log("user is able to register",true);
	}
	@Test(priority = 2)
	public void login() {
//		System.out.println("user is able to login");
		Reporter.log("user is able to login",true);
	}
	
	@Test(priority = 4)
	public void cart() {
//		System.out.println("user is able to add in the cart");
		Reporter.log("user is able to add in the cart",true);
	}
	@Test(priority = 3)
	public void search() {
//		System.out.println("user is able to search");
		Reporter.log("user is able to search",true);
	}
	@Test(priority = 5)
	public void logout() {
//		System.out.println("user is able to logout");
		Reporter.log("user is able to logout",true);
	}

}
