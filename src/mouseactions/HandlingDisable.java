package mouseactions;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisable {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws AWTException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("file:///C:/Users/lohith/OneDrive/Desktop/html/6/disable.html");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("d1")).sendKeys("orange");
			RemoteWebDriver r = (RemoteWebDriver)driver; 
			r.executeScript("document.getElementById('d2').value='smith'");
			
			

}
}
