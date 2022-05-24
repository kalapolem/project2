package autolink;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggForLoop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
//WAS to print all autosuggestion in google page and search selenium with count and click on third autosuggestion
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		Thread.sleep(3000);
		List<WebElement> liele = driver.findElements(By.xpath("//li[@class='sbct']"));
		int count = liele.size();
		System.out.println("total list of autosuggestion are === "  +count);
		for(int i=0;i<count;i++) {
			Thread.sleep(3000);
			WebElement sugg = liele.get(i);
			Thread.sleep(3000);
			String text = sugg.getText();
			System.out.println(text);
		}
		liele.get(3).click();
		
      
}
}
