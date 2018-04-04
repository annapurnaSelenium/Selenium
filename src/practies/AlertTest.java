package practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		//capturing text present on alert
		System.out.println(alt.getText());
		
		alt.accept();//click on ok button
		
		//alt.dismiss();//click on cancel
	}

}
