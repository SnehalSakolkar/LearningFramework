package WorkingWithTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithdependsonMethod {
	
	@Test()
	public void register() {
//		System.out.println("user is able to register");
		Reporter.log("user is able to register",true);
//		throw new ArrayIndexOutOfBoundsException();
	}
	@Test(dependsOnMethods = "register" )
	public void login() {
//		System.out.println("user is able to login");
		Reporter.log("user is able to login",true);
	}
	
	@Test(dependsOnMethods = "search")
	public void cart() {
//		System.out.println("user is able to add in the cart");
		Reporter.log("user is able to add in the cart",true);
	}
	@Test(dependsOnMethods = "login")
	public void search() {
//		System.out.println("user is able to search");
		Reporter.log("user is able to search",true);
	}
	@Test(dependsOnMethods = "cart")
	public void logout() {
//		System.out.println("user is able to logout");
		Reporter.log("user is able to logout",true);
	}

}
