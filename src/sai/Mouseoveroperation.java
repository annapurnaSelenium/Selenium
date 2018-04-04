package sai;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveroperation {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.naaptol.com/");
	driver.manage().window().maximize();
	WebElement Shoppingcategories =driver.findElement(By.xpath(".//*[@id='cate_head']/div[1]"));
	Actions Mouse=new Actions(driver);
	Mouse.moveToElement(Shoppingcategories).build().perform();
	
	

	}

}
