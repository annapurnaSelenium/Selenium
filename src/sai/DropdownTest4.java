package sai;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropdownTest4 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("drlist"));
		List<WebElement>dropList=drop.findElements(By.tagName("option"));
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) {
if(dropList.get(i).getText().equals("amberpet12"))
			{
				dropList.get(i).click();
			break;
		}
	}

	}

}

