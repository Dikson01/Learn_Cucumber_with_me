package com.sele1.code;

import org.openqa.selenium.WebDriver;

public class _1browser_command {
	
	WebDriver driver;
	
	
	public void init(WebDriver driver) {
		this.driver = driver;
	}
	
	public void invoke() {
		driver.get("https://google.com");
//		System.out.println(driver.getTitle());                     // page title
		System.out.println(driver.getCurrentUrl());                // current URL
//		System.out.println(driver.getPageSource());                // HTML source
//		driver.close();         // close tab
//		driver.quit();
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public String Ass() {
		String x = driver.getTitle();
		return x;
	}
	
	public void navigate() {
		driver.get("https://google.com");
		driver.navigate().to("https://yahoo.com");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}
	
	

}
















