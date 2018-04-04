package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
	WebElement sl=driver.findElement(By.xpath(".//*[@id='slider']/span"));
	
	Actions sld=new Actions(driver);
	
	sld.clickAndHold(sl).moveByOffset(90, 0).release(sl).build().perform();
	
	Thread.sleep(3000);
	
	sld.clickAndHold(sl).moveByOffset(-90, 0).release(sl).build().perform();	

	}

}
