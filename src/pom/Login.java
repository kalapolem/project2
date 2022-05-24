package pom;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws AWTException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/login.php?type=login");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			SkillraryLogin s=new SkillraryLogin(driver);
			s.un("admin");
			s.pw("admin");
			s.ln();
			
			
			
	}

}
