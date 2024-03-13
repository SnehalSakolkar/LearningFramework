package WorkingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClickMethod {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		String url =driver.getCurrentUrl();
		if(url.contains("register")) {
			
			System.out.println("User is in Register Page");
		}else {
			
			System.out.println("User is in Register Page");
			
		}
	
}

}
