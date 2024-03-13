package PracticingSeleniumwithJavaScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingTheScreenshots {

public static void main(String[] args) throws IOException, InterruptedException {
		
	//	WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	driver.get("https://demowebshop.tricentis.com/");
	//	
	//	//Converting reference of driver to takescreenshots
	//	
	//	TakesScreenshot ts=(TakesScreenshot)driver;
	//	File file =ts.getScreenshotAs(OutputType.FILE);
	//	
	//	File target=new File("./errorshots/demowebshop.png");
	//	FileHandler.copy(file, target);
		
	//	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	//	Thread.sleep(3000);
	//	 File target1=new File("./errorshots/Login.png");
	//	 FileHandler.copy(file, target1);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	//Converting reference of driver to takescreenshots
	TakesScreenshot ts=(TakesScreenshot)driver;
	File file = ts.getScreenshotAs(OutputType.FILE);
	File target=new File("./errorshots/demowebshop.png");
	FileHandler.copy(file, target);
	Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[text()='Log in']")).click();
	 File file1 = ts.getScreenshotAs(OutputType.FILE);
	 File target1=new File("./errorshots/Login.png");
	 FileHandler.copy(file1, target1);
}	 
		
}
