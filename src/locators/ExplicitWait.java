package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {


		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/login.php?type=login");
			WebDriverWait wait=new WebDriverWait(driver,5);		
			
			// WebElement us = driver.findElement(By.id("email"));
			//wait.until(ExpectedConditions.visibilityOf(us)).sendKeys("admin");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("admin");
			WebElement b = driver.findElement(By.id("last"));
			wait.until(ExpectedConditions.visibilityOf(b)).click();
			String t = driver.getTitle();
			wait.until(ExpectedConditions.titleContains(t));
			System.out.println(t);
			driver.findElement(By.xpath("//span[.='Sales']")).click();
			//driver.close();

		}
}
