package sai;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdowns {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.quikr.com/");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("searchedCat"));
		List<WebElement> dropList=drop.findElements(By.tagName("a"));
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) 
		{
			if (dropList.get(i).getText().equals("jobs"))
			{
				dropList.get(i).click();
			}
			
			
		}

	}

}
