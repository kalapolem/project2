package handlinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrPrintWithoutLooping {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
//WAS to print all the options present in MTR list box without looping statment
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("file:///C:/Users/lohith/OneDrive/Desktop/html/MTR.html");
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     WebElement allOptions = driver.findElement(By.id("mtr"));
     Select s=new Select(allOptions);
     WebElement AllOption = s.getWrappedElement();
     String text = AllOption.getText();
     System.out.println(text);
     driver.close();
     
     

}
}
