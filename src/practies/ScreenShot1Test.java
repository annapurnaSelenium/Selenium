package practies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot1Test {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		try
		{
			driver.findElement(By.linkText("Rajanikanth")).click();	
		}catch(Exception e)
		{
			TakesScreenshot  ts=(TakesScreenshot)driver;
			File srcFile=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\vasu\\Desktop\\ScreenShot\\erro.png"));
		}
		

	}

}
