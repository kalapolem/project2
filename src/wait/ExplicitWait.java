package wait;

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
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demoapp.skillrary.com/login.php?type=login");
   
   WebDriverWait wait=new WebDriverWait(driver,1);
   
   WebElement un = driver.findElement(By.id("email"));
   
   wait.until(ExpectedConditions.visibilityOf(un)).sendKeys("admin");
   
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("admin");
 //  driver.findElement(By.name("password")).sendKeys("admin");
   
   WebElement cl = driver.findElement(By.id("last"));
   
   wait.until(ExpectedConditions.elementToBeClickable(cl)).click();
   
   wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Sales"))).click();
   
   //driver.findElement(By.partialLinkText("Sales")).click();
	}

}
