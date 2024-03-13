package WorkingWithPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public static void main(String[] args) throws IOException {
		File file=new File("./testData/testData.properties");
		
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String url=prop.getProperty("url");
		System.out.println(url);
		String name=prop.getProperty("Name");
		String lastName=prop.getProperty("LastName");
		String companyName=prop.getProperty("CompanyName");
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(companyName);
	}


}
