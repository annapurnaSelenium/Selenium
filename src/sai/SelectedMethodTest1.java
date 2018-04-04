package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedMethodTest1 {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://www.spicejet.com/");
	WebElement drop=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	Select slt=new Select(drop);
	slt.selectByIndex(5);
	slt.selectByValue("4");
	slt.selectByVisibleText("8");
	}

}

