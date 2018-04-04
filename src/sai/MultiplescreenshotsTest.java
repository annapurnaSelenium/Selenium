package sai;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultiplescreenshotsTest {
	@Test
	public void Multiplescreenshots(){
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("url");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
	}

}
