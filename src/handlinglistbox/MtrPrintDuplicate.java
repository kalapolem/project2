package handlinglistbox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrPrintDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
//WAS to print only duplicate option pesent in MTR list box
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lohith/OneDrive/Desktop/html/MTR.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> AllOption = s.getOptions();
		HashSet<String> h=new HashSet<>();
		for(WebElement a:AllOption) {
			String text = a.getText();
			//if it is fase print duplicate
			if(h.add(text)== false) {
				System.out.println(text);
			}
		}
		driver.close();
		     
		

	}

}
