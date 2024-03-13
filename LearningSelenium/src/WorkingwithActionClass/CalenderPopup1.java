package WorkingwithActionClass;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime ldt=LocalDateTime.now().plusMonths(2).plusDays(1);
		String month=ldt.getMonth().name();
		month=month.substring(0,1)+month.substring(1).toLowerCase();
//		System.out.println(month);
		int date=ldt.getDayOfMonth();
		int year=ldt.getYear();
		System.out.println(month);
		System.out.println(date);
		System.out.println(year);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.lufthansa.com");
		driver.findElement(By.xpath("//button[text()='ACCEPT']")).click();
	    WebElement anotherFrame=driver.findElement(By.xpath("(//iframe)[3]"));
		driver.switchTo().frame(anotherFrame);
	//	driver.findElement(By.xpath("//i[contains(@class,'wewidgeticon we_close')]")).click();
		driver.switchTo().defaultContent();//to switch to parent frame
		driver.findElement(By.xpath("//label[@for='departure']")).click();
//		WebElement datebtn = driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']"));
//		Thread.sleep(2000);
//		datebtn.click();
		
		for(;;){
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
			}
	
		}
		
		
	}


}
