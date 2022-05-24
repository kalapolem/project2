package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTabs {
			static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.partialLinkText("actiTIME Inc.")).click();
	    Set<String> allW = driver.getWindowHandles();
	    int cou = allW.size();
	    System.out.println(cou);
	    driver.quit();

}
	}
