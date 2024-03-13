package WorkingWithWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	
public static void main(String []args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://Facebook.com/");
		
		String title=driver.getTitle();
		String arr[]=title.split(" ");
		
		String updatedString=" ";
		for(int i=0;i<arr.length;i++) {
			
			updatedString=updatedString+arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ";
	
	}
        updatedString=updatedString.trim();
		System.out.println("updatedString");
}

}
