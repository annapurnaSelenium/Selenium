package practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

	public static void main(String[] args)
	{
		//launching firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		//navigate to a url
		driver.get("Http://Facebook.com");

	}

}
