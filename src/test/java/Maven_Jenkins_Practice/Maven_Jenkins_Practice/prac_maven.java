package Maven_Jenkins_Practice.Maven_Jenkins_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class prac_maven {

	
	@Test
	
	public void m1() throws InterruptedException{
	

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys("TestingMasters");
			}

}
