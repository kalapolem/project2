package SCSM19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifing {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000); 
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("login")).click();
		String ti = driver.getTitle();
		System.out.println("title is===== " +ti);
		if(ti.equals("SkillRary Ecommerce")) {
			System.out.println("title is displayed ,test is pass");
		}
		else {
			System.out.println("title is not matching ,test its fail");
		}
		driver.close();

	}

}
