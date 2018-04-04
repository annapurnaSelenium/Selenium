package practies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RepositoryTest {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:/Selenium@4PM/Selenium/vasu.properties");
		
		Properties pr=new Properties();
		pr.load(fis);
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(pr.getProperty("URL"));

	}

}
