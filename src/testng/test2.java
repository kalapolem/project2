package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
	@Test
	public void demo2() {
		System.out.println("hellow");
		Reporter.log("hi",true);
		Reporter.log("welcome",false);
		
	}

}
