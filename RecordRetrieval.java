package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class RecordRetrieval {

	public static void main(String[] args) throws InterruptedException {
		
                WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();	
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")).click();
		driver.findElement(By.id("patient-search")).sendKeys("Michael Green");
		driver.findElement(By.xpath("//*[@id=\"patient-search-results-table\"]/tbody/tr[1]/td[1]")).click();
		WebElement apbutton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[9]/div[1]/div/div[1]/div[6]/div[1]/a/i"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", apbutton);
		Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/i")).click();
		driver.quit();
	}
}
