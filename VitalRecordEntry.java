package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class VitalRecordEntry {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();	
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin123");
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("referenceapplication-vitals-referenceapplication-vitals-extension")).click();
		driver.findElement(By.id("patient-search")).sendKeys("100J19");
		driver.findElement(By.className("odd")).click();
		driver.findElement(By.className("icon-arrow-right")).click();
		driver.findElement(By.id("w8")).sendKeys("170");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("w10")).sendKeys("75");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("w12")).sendKeys("40");
		driver.findElement(By.id("next-button")).click();
                driver.findElement(By.id("w14")).sendKeys("85");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("w16")).sendKeys("15");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("w18")).sendKeys("120");
		driver.findElement(By.id("w20")).sendKeys("80");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("w22")).sendKeys("98");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.xpath("//*[@id=\"confirmationQuestion\"]/p[1]/button")).click();

	}

}
