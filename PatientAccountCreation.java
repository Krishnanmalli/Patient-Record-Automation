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
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
		driver.findElement(By.name("givenName")).sendKeys("Michael");
		driver.findElement(By.name("familyName")).sendKeys("Carter");
                Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
		Select genderfield = new Select(driver.findElement(By.id("gender-field")));
		genderfield.selectByValue("M");
                Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("birthdateDay-field")).sendKeys("5");
		Select birthdaymonth = new Select(driver.findElement(By.id("birthdateMonth-field")));
		birthdaymonth.selectByValue("2");
		driver.findElement(By.id("birthdateYear-field")).sendKeys("1996");
                Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("address1")).sendKeys("742 Evergreen Terrace");
		driver.findElement(By.id("cityVillage")).sendKeys("Springfield");
		driver.findElement(By.id("stateProvince")).sendKeys("IL");
		driver.findElement(By.id("country")).sendKeys("USA");
		driver.findElement(By.id("postalCode")).sendKeys("62704");
                Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("+1 (312) 774-9283");
                Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
		Select relation = new Select(driver.findElement(By.id("relationship_type")));
		relation.selectByVisibleText("Parent");
		driver.findElement(By.className("person-typeahead")).sendKeys("Anbu");
                Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("submit")).click();
                Thread.sleep(8000);
     	        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/i")).click();
                Thread.sleep(5000);
                driver.quit();
	}
}


