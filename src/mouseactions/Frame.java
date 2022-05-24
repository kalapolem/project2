package mouseactions;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to switch frome frame 1 to another frame and send text to textfilds
public class Frame {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws AWTException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("file:///C:/Users/lohith/OneDrive/Desktop/html/6/demoframe1.html");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("t1")).sendKeys("a");
			driver.switchTo().frame(0);
			Thread.sleep(4000);			
			driver.findElement(By.id("t2")).sendKeys("b");
			driver.switchTo().defaultContent();
			Thread.sleep(4000);		
			driver.findElement(By.id("t1")).sendKeys("c");
			driver.switchTo().frame(0);
			Thread.sleep(4000);	
			driver.findElement(By.id("t2")).sendKeys("d");
			
			

}
}