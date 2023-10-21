package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class id {
	
	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/gaura/OneDrive/Desktop/Seleniun%20Link/SimpleLogin.html");
		Thread.sleep(2000);
		//identify usernameTB and pass input AS "Admin"
		driver.findElement(By.id("i1")).sendKeys("Admin");
		//identify usernameTB and pass input AS "Manager"
		Thread.sleep(2000);
		driver.findElement(By.id("i2")).sendKeys("Manager");
	}

}



