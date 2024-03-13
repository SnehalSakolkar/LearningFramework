package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshotsAmazon {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    driver.get("https://www.amazon.in/");
	    
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File file = ts.getScreenshotAs(OutputType.FILE);
	    File target=new File("./amazon/homepage.png");
	    FileHandler.copy(file, target);
		Thread.sleep(3000);
		
	    
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		 File target1=new File("./amazon/mobile.png");
		 FileHandler.copy(file1, target1);
	
}
}