package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistara {

	public static void main(String[] args) {
		
		//handle notification pop in chrome browser
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en");
		
		driver.findElement(By.("")).click();

	}

}
