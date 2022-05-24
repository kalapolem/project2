package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demoapp.skillrary.com/login.php?type=login");
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
	}

}
