package SCSM19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserWebDriver {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      //maximise the window
      driver.manage().window().maximize();
      //Enter the URL
      driver.get("https://www.flipkart.com/");
      //get the url
      System.out.println(driver.getCurrentUrl());
     //get the ttle
      System.out.println(driver.getTitle());
      //close the application
      driver.close();
	}

}
