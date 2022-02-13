package baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	
		public static void setup() 
		{
		
		System.setProperty("webdriver.chrome.driver", "C://SeleniumResources//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://petstore.octoperf.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Enter the Store")).click();
		

		
	}

}
