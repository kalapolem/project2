package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to count the no of windows open after clickinf the button
public class PopUpWindowSwitch {
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
    int count = whAll.size();
    System.out.println("total number of windows ====" +count);
    driver.quit();
    

}
}