package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpUploadFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lohith/OneDrive/Desktop/html/fileupload.html");
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\lohith\\OneDrive\\Desktop\\files\\resume.pdf");

}
}
