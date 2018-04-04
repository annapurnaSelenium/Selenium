package sai;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) {
		String date="12/march/2018";
		String [] datesplit=date.split("/");
		String day= datesplit[0];
		String month=datesplit[1];
		String year=datesplit[2];
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("DepartDate")).click();
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calyear.equalsIgnoreCase(month)) {
			driver.findElement(By.className("nextMonth")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) {
		List<WebElement>col=rows.get(i)	.findElements(By.tagName("td"));
		for (int j = 0; j < col.size(); j++) {
			String calday=col.get(i).getText();
			if(calday.equals(day))
			{
				col.get(j).click();
			}
		}
		}
	}

}
