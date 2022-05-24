package PopUp;

import java.io.IOException;
import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;

public class RobotClass {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
      Runtime.getRuntime().exec("notepad");
       
      Robot r=new Robot();
      r.keyPress(KeyEvent.VK_SHIFT);
      r.keyPress(KeyEvent.VK_Q);
      r.keyRelease(KeyEvent.VK_SHIFT);
      r.keyPress(KeyEvent.VK_S);
      r.keyPress(KeyEvent.VK_P);
      r.keyPress(KeyEvent.VK_I);
      r.keyPress(KeyEvent.VK_D);
      r.keyPress(KeyEvent.VK_E);
      r.keyPress(KeyEvent.VK_R);      
      r.keyPress(KeyEvent.VK_P);
      
      
      
	}

}
