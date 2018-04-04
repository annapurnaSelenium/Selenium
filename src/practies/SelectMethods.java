package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(drop);
		sl.selectByIndex(6);
		//sl.selectByValue("search-alias=electronics");
		//sl.selectByVisibleText("Home & Kitchen");
		/*List<WebElement> dropList=sl.getOptions();
		System.out.println(dropList.size());
		
		for(WebElement list:dropList)
		{
			System.out.println(list.getText());
		}*/
		
		//System.out.println(sl.isMultiple());//true  /false
	/*WebElement first=sl.getFirstSelectedOption();
	System.out.println(first.getText());*/
	List<WebElement> col=sl.getAllSelectedOptions();
	System.out.println(col.size());
	for (int i = 0; i < col.size(); i++)
	{
		System.out.println(col.get(i).getText());
	}
		

	}

}
