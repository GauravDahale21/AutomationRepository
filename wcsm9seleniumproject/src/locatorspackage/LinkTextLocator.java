package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) { 
       
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/gaura/OneDrive/Desktop/Seleniun%20Link/link.html");
		
		//identify 
		driver.findElement(By.linkText("seleniumLink")).click();

	}

}
