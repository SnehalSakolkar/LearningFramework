package Practicing;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String []args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///Users/ashishkulkarni/Downloads/Thread.html");
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.partialLinkText("Facebook")).click();
	}
}
