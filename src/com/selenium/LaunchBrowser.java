package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem kumar\\eclipse-workspace\\sathish.1\\SeleniumProject\\driver\\chromedriver.exe");
		//launching browser
		WebDriver driver =new ChromeDriver();
		//url
		driver.get("https://www.facebook.com/");
		
		WebElement textUser = driver.findElement(By.id("email"));
		textUser.sendKeys("Ajith");
		
		WebElement textPass = driver.findElement(By.name("pass"));
		textPass.sendKeys("java");
		
		driver.quit();
	}
}
