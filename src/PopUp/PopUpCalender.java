package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PopUpCalender {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("policynumber")).sendKeys("563634");
		driver.findElement(By.name("dob")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select s=new Select(ele);
		s.selectByVisibleText("Mar");
		WebElement ele1 = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select s1=new Select(ele1);
		s1.selectByValue("1990");
		//calender popup handles
		driver.findElement(By.xpath("//a[text()='5']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("78576");
		driver.findElement(By.xpath("//button[@class='submit-login']")).click();
		WebElement text = driver.findElement(By.xpath("(//span[@class='ErrorField'])[3]"));
		System.out.println(text.getText());
		driver.close();
		
		

}
}
