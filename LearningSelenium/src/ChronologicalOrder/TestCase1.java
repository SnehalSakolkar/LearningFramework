package ChronologicalOrder;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1  extends BaseClass {
	
	

		
		@Test(groups = "shoppingCart")
		public void shoppingCart() {
			driver.findElement(By.partialLinkText("Shopping cart")).click();
			Reporter.log("User is able to click shopping cart module",true);
		}

				
}
