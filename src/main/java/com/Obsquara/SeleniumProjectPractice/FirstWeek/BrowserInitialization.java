package com.Obsquara.SeleniumProjectPractice.FirstWeek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialization {
	WebDriver driver;
	public void initialize()
	{
		driver = new ChromeDriver();
		driver.get("https://mvnrepository.com");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
	}
	public void browserClose()
	{
		driver.quit();
	}

	public static void main(String[] args) {
		BrowserInitialization initial = new BrowserInitialization();
		initial.initialize();
		initial.browserClose();

	}

}
