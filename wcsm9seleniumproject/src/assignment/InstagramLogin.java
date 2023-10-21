package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		// identify user name textbox and pass input
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("123456");
		
		//identify password textbox and apass input
		driver.findElement(By.xpath("//input[contains(@name,'p')]")).sendKeys("1234567");
				
				
		//identify loginButton  and click 
		driver.findElement(By.xpath("//div[contains(text(),'L')]")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
