package practies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipletabsTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String homepage=driver.getWindowHandle();
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a")).click();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
	while(it.hasNext())
	{
		String current=it.next().toString();
		System.out.println(current);
	}
		

	}

}
