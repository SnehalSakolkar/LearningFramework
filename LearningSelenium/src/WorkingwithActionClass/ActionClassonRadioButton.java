package WorkingwithActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassonRadioButton {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action = new Actions(driver);
		List <WebElement> elements= driver.findElements(By.xpath("//input[@type='radio']"));
		
for (WebElement element:elements) {
	
	action.moveToElement(element).click().perform();
	Thread.sleep(2000);
}
driver.close();
}
}