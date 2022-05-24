package mouseactions;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrool {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws AWTException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.bbc.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("window.scrollBy(0,6000)");

}
}