package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XathText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("orange");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log In']")).click();


	}

}
