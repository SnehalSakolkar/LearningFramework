package WorkingWithFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.findElement(By.id("accept-choices")).click();
		driver.switchTo().frame("iframeResult");
		WebElement firstName = driver.findElement(By.id("fname"));
		firstName.clear();
		Thread.sleep(1000);
		firstName.sendKeys("Prem");
		Thread.sleep(1000);
		WebElement lastName = driver.findElement(By.id("lname"));
		Thread.sleep(1000);
		lastName.clear();
		Thread.sleep(1000);
		lastName.sendKeys("Choudhary");
		//to move the control to the parent frame
		driver.switchTo().defaultContent();
		driver.findElement(By.id("runbtn")).click();
	}

}
