package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click with ok button
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		//click the button to diplay on alert box ok and cancle button
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert alr = driver.switchTo().alert();
		String t1 = alr.getText();
		System.out.println(t1);
		alr.sendKeys("lohith");
		alr.accept();
		WebElement t2 = driver.findElement(By.xpath("//p[@id='demo1']"));
		System.out.println(t2.getText());
		driver.close();
		
}
}
