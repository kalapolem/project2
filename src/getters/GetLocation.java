package getters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("email"));
		WebElement ele2 = driver.findElement(By.id("passContainer"));
		Point lo = ele.getLocation();
		Point lo2 = ele2.getLocation();
		int x1 = lo.getX();
		int y1 = lo.getY();
		System.out.println("location of x1 is ==="  +x1);
		System.out.println("location of y1 is ===="  +y1);
		int x2 = lo2.getX();
		int y2 = lo2.getY();
		System.out.println("location of x2 is ==="  +x2);
		System.out.println("location of y2 is ==="  +y2);
		if(x1==x2) {
			System.out.println("allignment of username and password text box x-axis correct ,test pass");
		}
		else {
			System.out.println("allignement is not correc , test fail , rais the bug to developer");
		}
		driver.close();
		
		

	}

}
