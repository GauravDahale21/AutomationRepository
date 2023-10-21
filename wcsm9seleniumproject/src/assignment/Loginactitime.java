package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginactitime 

	public static void main(String[] args) { throws InterruptedException { 
		

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://hp/login.do");
	Thread.sleep(2000);
	//identify username and pass input AS "Admin"
	driver.findElement(By.id("input")).sendKeys("Admin");
	//identify usernameTB and pass input AS "Manager"
	Thread.sleep(2000);
	driver.findElement(By.id("input")).sendKeys("Manager");
}
