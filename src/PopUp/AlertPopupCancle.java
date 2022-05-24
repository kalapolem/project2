package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupCancle {
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
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		//click the button to diplay on alert box ok and cancle button
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert alr = driver.switchTo().alert();
		alr.dismiss();
		WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(text.getText());
		//driver.close();

}
}
