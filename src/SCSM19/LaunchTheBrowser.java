package SCSM19;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {
   static {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver c=new ChromeDriver();
	}

}
