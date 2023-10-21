package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/gaura/Downloads/RadioButton.html");
		Thread.sleep(2000);
		//identify d radio button by using name Locator
		driver.findElement(By.name("name3")).click();
		//identify a radio button by using name Locator
		Thread.sleep(2000);
		driver.findElement(By.name("name1")).click();
		Thread.sleep(2000);
	}

}
