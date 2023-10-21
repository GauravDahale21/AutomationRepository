package assignment;

public class Loginpage {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("student");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("submit")).click();
		
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
		
		driver.close();
	}

	}

}
