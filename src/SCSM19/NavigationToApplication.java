package SCSM19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationToApplication {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
      
       Thread.sleep(3000);
       driver.get("https://www.amazon.com/");
       Thread.sleep(3000);
       driver.get("https://www.flipkart.com/");
       //back
       Thread.sleep(3000);
       driver.navigate().back();
       //forward
       Thread.sleep(3000);
       driver.navigate().forward();
       //refresh
       Thread.sleep(3000);
       driver.navigate().refresh();
       driver.close();
	}

}
