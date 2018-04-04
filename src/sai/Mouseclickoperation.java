package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseclickoperation {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement Kids=driver.findElement(By.xpath(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[3]"));
		WebElement Dresses =driver.findElement(By.xpath(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[3]/div/div/div/ul[2]/li[2]/a"));
		Actions Mouse=new Actions(driver);
		Mouse.moveToElement(Kids).build().perform();
		Mouse.moveToElement(Dresses).click().build().perform();
		

	}

}
