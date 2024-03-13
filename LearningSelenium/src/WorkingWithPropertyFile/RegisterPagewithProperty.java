package WorkingWithPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPagewithProperty {
	
public static void main(String []args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		File file=new File("./testData/Register.properties");
		
		driver.findElement(By.id("gender-female")).click();
		
        FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
		System.out.println(url);
		String name=prop.getProperty("Name");
		String lastName=prop.getProperty("LastName");
		String Email=prop.getProperty("Email");
		String Password=prop.getProperty("Password");
		String ConfirmPassword=prop.getProperty("ConfirmPassword");
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(Email);
		System.out.println(Password);
		System.out.println(ConfirmPassword);
		

		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Snehal");
     	driver.findElement(By.id("LastName")).sendKeys("Kulkarni");
		driver.findElement(By.id("Email")).sendKeys("snehalsakolkar9@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Snehu@Germany");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Snehu@Germany");
		driver.findElement(By.id("register-button")).click();
		
}
}