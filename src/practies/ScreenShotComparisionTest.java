package practies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotComparisionTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
	File srcFile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	driver.get("http://yahoo.com");
	
	File srcFile2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	if (FileUtils.contentEquals(srcFile1, srcFile2)) 
	{
		System.out.println("ScreenShots are Same");
	}else
	{
		System.out.println("ScreenShots are different");
	}

	}

}
