package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void demo() {
		System.out.println("hi");
		Reporter.log("hellow",true);
		Reporter.log("welcome",false);
		
	}

}
