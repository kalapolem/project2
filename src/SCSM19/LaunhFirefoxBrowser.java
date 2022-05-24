package SCSM19;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunhFirefoxBrowser {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      FirefoxDriver f=new FirefoxDriver();
	}
}
