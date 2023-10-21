package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnXpath {
	
	public static void main(String[] args) {
		
        // launch the browser
		WebDriver driver=new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//launch the application
		driver.get("https://www.flipkart.com/");
		//handle hidden division pop up 
		driver.findElement(By.xpath("//span[text()='X']")).click();
		//identify searchBox
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		// identify search icon and click
		driver.findElement(By.xpath("//button[contains(@aria-label,'Brands and More')]")).click();
		// print the price of 2nd option
		//driver.findElement(By.xpath("//div[@class='_4rR01""/descendant::div[@class='
			
	}

}
