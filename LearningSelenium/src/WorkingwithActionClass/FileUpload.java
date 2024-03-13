package WorkingwithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions option=new ChromeOptions();
	option.addArguments("incognito");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("register_Layer")).click();
	driver.findElement(By.xpath("(//div[contains(@class,'focusable')])[1]")).click();
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
    Thread.sleep(2000);

}
}