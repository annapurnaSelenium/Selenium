package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/matrimony/misspelt-sadi-saadi");
		driver.manage().window().maximize();
		driver.findElement(By.id("gender-male")).click();
}
}