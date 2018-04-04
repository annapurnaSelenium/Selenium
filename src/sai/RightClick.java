package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick 
{
	public static void main(String[] args) {
			FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		Actions right=new Actions(driver);
		right.contextClick(gmail).sendKeys("W").click().build().perform();
		
	
	}

}
