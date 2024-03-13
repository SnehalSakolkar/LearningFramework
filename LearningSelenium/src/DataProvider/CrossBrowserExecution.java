package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserExecution {

	 

		WebDriver driver;

		@Parameters({"browser","url"})
		@Test
		public void browser(@Optional(value="chromedriver")String browser,String url) {
			
			if (browser.equalsIgnoreCase("chromedriver")) {
			//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				
			//	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				
				
			} else if (browser.equalsIgnoreCase("edge")) {
				
		//		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
				driver = new EdgeDriver();
				
			} else {
				Reporter.log("invalid browser input", true);
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(url);
		}
}
