package handlinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   driver.findElement(By.xpath("//a[@rel='async']")).click();
   WebElement MonthListBox = driver.findElement(By.id("month"));
   Select s=new Select(MonthListBox);
   Thread.sleep(5000);
   s.selectByIndex(9);
   Thread.sleep(5000);
   s.selectByValue("5");
   Thread.sleep(5000);
   s.selectByVisibleText("Dec");
   Thread.sleep(5000);
   driver.close();
   
   
   
	}

}
