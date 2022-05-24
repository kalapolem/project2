package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      WebElement st = driver.findElement(By.name("q"));
      Thread.sleep(3000);
      st.sendKeys("pendrive");
      Thread.sleep(3000);
      st.clear();
      Thread.sleep(5000);
      driver.close();
	}

}
