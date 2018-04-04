package sai;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedMethodTest3 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		Select slt=new Select(drop);
		List<WebElement>dropList=slt.getOptions();
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) {
			System.out.println(dropList.get(i).getText());
			if (dropList.get(i).getText().equals("Baby")) {
				dropList.get(i).click();
			}
		}
	}

}
