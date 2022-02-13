package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://SeleniumResources//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		driver.manage().window().maximize();
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Thread.sleep(3000);
		System.out.println("Application Opened");
		driver.findElement(By.name("username")).sendKeys("asrsirisha");
		//Thread.sleep(3000);
		
		
		driver.findElement(By.name("password")).clear();
		//Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Testing@123");
		//Thread.sleep(3000);
		driver.findElement(By.name("signon")).click();
		//Thread.sleep(5000);
		System.out.println("Login Completed");
		//driver.close();
		}
		
		
		
		

	}

