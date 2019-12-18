package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Employee {
@Test
public void him(){
	WebDriver d=null;
	WebDriverWait w=new WebDriverWait(d, 20);
	WebElement h=d.findElement(By.id("email"));
}

}
