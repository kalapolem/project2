package PopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpFileUploadGeneric {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lohith/OneDrive/Desktop/html/fileupload.html");
		File f=new File("./data/resume.pdf");
		String aPath = f.getAbsolutePath();		
		driver.findElement(By.id("cv")).sendKeys(aPath);

}
}
