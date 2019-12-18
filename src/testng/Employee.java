package testng;

<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
=======
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
>>>>>>> ddb61f1d11194cb39428084961f9947b4b70d0ad
import org.testng.annotations.Test;

public class Employee {
	
@Test
<<<<<<< HEAD
public void him(){
	WebDriver d=null;
	WebDriverWait w=new WebDriverWait(d, 20);
	WebElement h=d.findElement(By.id("email"));
=======
public void sys(){
	WebDriver d=null;
	d.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
	System.out.println("Himaja");
	
	System.out.println("Goutham");
>>>>>>> ddb61f1d11194cb39428084961f9947b4b70d0ad
}

}
