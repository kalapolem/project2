package handlinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlvPrintAll {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
//WAS to print all option using for each loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("file:///C:/Users/lohith/OneDrive/Desktop/html/SLV.html");
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     WebElement SlvListbox = driver.findElement(By.id("slv"));
     Select s=new Select(SlvListbox);
     List<WebElement> alloption = s.getAllSelectedOptions();
     for(WebElement option:alloption) {
    	 String text = option.getText();
    	 System.err.println(text);    	 
     }
     driver.close();
     

}
}
