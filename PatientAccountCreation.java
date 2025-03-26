package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PatientAccountCreation {
	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
		driver.findElement(By.name("givenName")).sendKeys("Krishnan");
		driver.findElement(By.name("familyName")).sendKeys("Malli");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.xpath("//*[@id=\"gender-field\"]/option[1]")).click(); 
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("birthdateYears-field")).sendKeys("21");
		driver.findElement(By.id("birthdateMonths-field")).sendKeys("3");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("address1")).sendKeys("1/1 Murugan Street");
		driver.findElement(By.id("cityVillage")).sendKeys("Chennai");
		driver.findElement(By.id("stateProvince")).sendKeys("Tamilnadu");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("postalCode")).sendKeys("600011");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9874562310");
		driver.findElement(By.id("next-button")).click();
		Select relation = new Select(driver.findElement(By.id("relationship_type")));
		relation.selectByIndex(1);
		Thread.sleep(2000);
		relation.selectByValue("8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A");
		Thread.sleep(2000);
		relation.selectByVisibleText("Parent");
		Thread.sleep(2000);
		driver.findElement(By.className("person-typeahead")).sendKeys("anbu");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("submit")).click();
	}
}

