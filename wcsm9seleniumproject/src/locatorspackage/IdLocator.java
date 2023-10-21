package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IdLocator {
	
	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/gaura/OneDrive/Desktop/Seleniun%20Link/SimpleLogin.html");
		Thread.sleep(4000);
		//identify usernameTB and pass input AS "Admin"
		driver.findElement(By.id("i1")).sendKeys("Admin");
		//identify usernameTB and pass input AS "Manager"
		Thread.sleep(4000);
		driver.findElement(By.id("i2")).sendKeys("Manager");
		driver.close();
	}

}



