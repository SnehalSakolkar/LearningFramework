package ChronologicalOrder;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite",true);
	}

	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test",true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before Class",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before Method",true);
	}

	@Test
	public void test() {
		
		Reporter.log("test Method",true);
	}
  @AfterMethod
  public void afterMethod() {
	Reporter.log("After Method",true);
	
}
  @AfterClass
  public void afterClass() {
	Reporter.log("After Class",true);
	
}
  @AfterTest
  public void afterTest() {
	Reporter.log("After Test",true);
	
}

  @AfterSuite
  public void afterSuite() {
	Reporter.log("After Suite",true);
	
}

}
