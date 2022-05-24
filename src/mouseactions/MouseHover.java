package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to mouse hover to course drop down and clik on selenium in demoskillrary application 
public class MouseHover {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		String url1 = driver.getCurrentUrl();
		System.out.println("the main page url is ===" +url1);
		String tit1 = driver.getTitle();
		System.out.println("the main page title is ====" +tit1);
		WebElement ele = driver.findElement(By.partialLinkText("COURSE"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	    driver.findElement(By.partialLinkText("Selenium Training")).click();
	    WebElement ele2 = driver.findElement(By.xpath("//button[@id='add']"));
		a.doubleClick(ele2).perform();
		String tit = driver.getTitle();
		System.out.println("title of page===" +tit);
		String ur = driver.getCurrentUrl();
		System.out.println("the course select page url is ===" +ur);
		
		
		
	}
	}


