package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmpTest extends OrangeHrmTest
{
	@Test
	public void empAdd()
	{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("annapurna123");
	driver.findElement(By.id("lastName")).sendKeys("annapurna");
	driver.findElement(By.id("photofile")).sendKeys("D:\\Chrysanthemum.jpg");
	
	driver.findElement(By.id("btnSave")).click();
	}
}
