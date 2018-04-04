package practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
driver.findElement(By.id("txtuId")).sendKeys("Admin");
driver.findElement(By.id("txtPword")).sendKeys("Admin");
driver.findElement(By.id("login")).click();
driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
driver.findElement(By.id("BtnNewBR")).click();
driver.findElement(By.id("txtbName")).sendKeys("VasudevaQed123");
driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet");
driver.findElement(By.id("txtZip")).sendKeys("12345");

Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
country.selectByVisibleText("INDIA");
Select state=new Select(driver.findElement(By.id("lst_stateI")));
state.selectByVisibleText("Andhra Pradesh");
Select city=new Select(driver.findElement(By.id("lst_cityI")));
city.selectByVisibleText("Hyderabad");
driver.findElement(By.id("btn_insert")).click();

Alert alt=driver.switchTo().alert();

String text=alt.getText();
alt.accept();

if (text.contains("created Sucessfully"))
{
System.out.println("Branch created Successfully");	
}else
{
	System.out.println("Branch Creation Faild");
}







	}

}
