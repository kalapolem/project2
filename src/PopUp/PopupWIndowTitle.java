package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to print the title of all the browsers opened by the application
public class PopupWIndowTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://nxtgenaiacademy.com/multiplewindows/");
    driver.findElement(By.name("newbrowserwindow123")).click();
    driver.findElement(By.name("newbrowserwindow123")).click();
    driver.findElement(By.name("newbrowserwindow123")).click();
    Set<String> whAll = driver.getWindowHandles();
    for(String a:whAll) {
    	driver.switchTo().window(a);
    	String tit = driver.getTitle();
    	System.out.println("the title of the browser =====" +tit);
    }    	
    driver.quit();     

	}

}
