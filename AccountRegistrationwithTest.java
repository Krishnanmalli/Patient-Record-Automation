package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountRegistrationwithTest {

	WebDriver driver;

	@BeforeMethod
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://awesomeqa.com/ui/");
	}

	@Test
	public void personaldetails() throws InterruptedException {
		driver.findElement(By.className("caret")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a")).click();
		Thread.sleep(500);
		driver.findElement(By.id("input-firstname")).sendKeys("Michael");
		driver.findElement(By.id("input-lastname")).sendKeys("carter");
		driver.findElement(By.id("input-email")).sendKeys("michae21778@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("+1 (555) 123-4567");
		driver.findElement(By.id("input-password")).sendKeys("Password");
		driver.findElement(By.id("input-confirm")).sendKeys("Password");
		Thread.sleep(500);
		driver.findElement(By.name("newsletter")).click();
		Thread.sleep(500);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		Thread.sleep(500);
	}

	@AfterMethod
	public void logout() throws InterruptedException{
		driver.findElement(By.cssSelector("#content > div > div > a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	    driver.quit();
		System.out.println("Account created successfully");
	}

}

