package WorkingwithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///Users/ashishkulkarni/Downloads/MultipleWindow%20(3).html");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		driver.close(); // Parent tab will get closed
		driver.quit(); // all the window get closed

		

}
}