package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttribute {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("orange");
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();

	}

}
