package SCSM19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delay {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("abcdwewe");
	
		driver.findElement(By.name("password")).sendKeys("cfhfgwetwe");
		
		driver.findElement(By.id("//div[text()='Log In']")).click();
		
	}
}
