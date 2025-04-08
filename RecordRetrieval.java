package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RecordRetrieval {

	public static void main(String[] args) {
                WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setHeadless(false);
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();	
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")).click();
		driver.findElement(By.id("patient-search")).sendKeys("Paul Walker");
		driver.findElement(By.className("odd")).click();
		driver.navigate().back();
                driver.findElement(By.id("patient-search")).sendKeys("Mary Miller");
                driver.findElement(By.className("odd")).click();
                driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();
                driver.findElement(By.className("nav-item logout")).click();
	}
}


