package handlinglistbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrAlphabeticalOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
//WAS to print all only duplicate option present in MTR list box
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("file:///C:/Users/lohith/OneDrive/Desktop/html/MTR.html");
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     WebElement allOptions = driver.findElement(By.id("mtr"));
     Select s=new Select(allOptions);
     List<WebElement> allOption = s.getOptions();
     ArrayList<String> a=new ArrayList<>();
     for(WebElement opt:allOption) {
    	 String text = opt.getText();
    	 a.add(text);
     }
     Collections.sort(a);
     System.out.println(a);
     driver.close();

}
}