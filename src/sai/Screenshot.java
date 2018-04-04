package sai;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import org.testng.annotations.Test;



public class Screenshot {
@Test
	public void screenshot() throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\WONDER1\\Desktop\\screenchot\\.g.png"));
		
	}

}
