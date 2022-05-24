package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=3)
	public void whatsUpcall() {
		Reporter.log("whats up calling",true);
	}
	@Test(priority=4,enabled=false)
	public void whatsPhonepay() {
		Reporter.log("by whatsup payment",true);
	}
	@Test(priority=1,invocationCount=5,enabled=false)
	public void whatsUpmessage() {
		Reporter.log("whats up message",true);
	}
	@Test(priority=2)
	public void whatsUpstatus() {
		Reporter.log("whats up status",true);
	}




}
