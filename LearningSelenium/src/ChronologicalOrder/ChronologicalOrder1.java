package ChronologicalOrder;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChronologicalOrder1 {
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before Method",true);
	}
	@Test
	public void test1() {
		
		Reporter.log("test1 Method",true);
	}
	@Test
	public void test2() {
		
		Reporter.log("test2 Method",true);

}
	@AfterMethod
	  public void afterMethod() {
		Reporter.log("After Method",true);
		
	}

}
