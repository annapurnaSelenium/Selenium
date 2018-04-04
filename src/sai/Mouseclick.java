package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseclick {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.movierulz.nz/");
		driver.manage().window().maximize();
		WebElement bollywood=driver.findElement(By.xpath(".//*[@id='menu-item-38162']/a"));
		WebElement bollywoodmovies2018=driver.findElement(By.xpath(".//*[@id='menu-item-69546']/a"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(bollywood).build().perform();
		mouse.moveToElement(bollywoodmovies2018).build().perform();

	}

}
