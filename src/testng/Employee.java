package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Employee {
	
@Test
public void sys(){
	WebDriver d=null;
	d.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
	System.out.println("Himaja");
	
	System.out.println("Goutham");
}

}
