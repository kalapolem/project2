package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Id_Name {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapp.skillrary.com/login.php?type=login");
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("admin");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("admin");
        Thread.sleep(3000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
        driver.close();
        
   
	}

}
