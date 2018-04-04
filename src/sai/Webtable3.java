package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable3 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html-tables.asp");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath(".//*@id='customers']/tbody/tr[4]/td[2]")).getText());
	}

}
