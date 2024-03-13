package Practicing;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckingPrice {
	
	public static void main(String []args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		
		
		driver.findElement(By.name("q")).sendKeys("Iphone 15",Keys.ENTER);
	//	WebElement input =driver.findElement(By.xpath(//img[@loading='eager']/../../../../..));

		
		List<WebElement> mobileName = driver.findElements(By.xpath("//img[@loading='eager']/../../../../..//div[contains(text(),'Apple')]"));
		List<WebElement> prices=driver.findElements(By.xpath("//img[@loading='eager'][1]/../../../../..//div[@class='_30jeq3 _1_WHN1']"));
		
		HashMap<String,String> data=new HashMap();
		
		for(int i=0;i<mobileName.size();i++) {
	data.put(mobileName.get(i).getText(),prices.get(i).getText());
		}
		
		for(Entry value:data.entrySet()) {
			System.out.println(value.getKey()+"----->"+value.getValue());
		}
		
	
		
		
	}	
		
		

}