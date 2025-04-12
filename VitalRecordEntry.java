package com.project;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VitalRecordEntry {

    public static void main(String[] args) throws InterruptedException {

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
        Thread.sleep(2000);    
        List<WebElement> patients = driver.findElements(By.cssSelector(".dataTable tbody tr"));
        int i = 0;
        for (i=0; i < patients.size(); i++) 
        {
            patients = driver.findElements(By.cssSelector(".dataTable tbody tr")); 
            WebElement patient = patients.get(i);
            patient.click();
            Thread.sleep(1000); 

            if (driver.findElements(By.className("active-visit-started-at-message")).size() > 0)
            {
                break; 
            }
            else 
            {
                driver.navigate().back(); 
                Thread.sleep(1000);
            }
        }

        if (i == patients.size()) {
            driver.quit();
            return;
        }
        driver.findElement(By.className("icon-arrow-right")).click(); 
        driver.findElement(By.id("w8")).sendKeys("170");
        driver.findElement(By.id("next-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("w10")).sendKeys("68");
        driver.findElement(By.id("next-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("next-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("w12")).sendKeys("30");
        driver.findElement(By.id("next-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("w14")).sendKeys("72");
        driver.findElement(By.id("next-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("w16")).sendKeys("16");
        driver.findElement(By.id("next-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("w18")).sendKeys("115");
        driver.findElement(By.id("w20")).sendKeys("75");
        driver.findElement(By.id("next-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("w22")).sendKeys("98");
        driver.findElement(By.id("next-button")).click();
        Thread.sleep(1000);
        WebElement confirmBtn = driver.findElement(By.xpath("//*[@id='confirmationQuestion']/p[1]/button"));
        confirmBtn.click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/i")).click();
        driver.quit();
    }
}
