package com.sele1.code;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator_commands {
	WebDriver driver;
	
	public void init(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Locator, WebElements and Wait
	public void Locators() throws InterruptedException {
		driver.get("https://google.com");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit wait(work for all elements.)
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit wait declaration.
		
		WebElement about = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("About")));
		about.click();
//		driver.findElement(By.linkText("About")).click();   //same as above bit without wait 
		driver.navigate().back();
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name = 'q']")));
		search.sendKeys("FB");
//		driver.findElement(By.xpath("//textarea[@name = 'q']")).sendKeys("fb");   //same as above without wait
		driver.findElement(By.xpath("//textarea[@name = 'q']")).clear();
		boolean b = driver.findElement(By.xpath("//a[contains(text(),'Store')]")).isDisplayed();
		System.out.println(b);
		String a = driver.findElement(By.xpath("//a[contains(text(),'Store')]")).getText();
		System.out.println(a);
		
		//WebElements
		List<WebElement> c = driver.findElements(By.cssSelector(".MV3Tnb"));
		for(WebElement i:c) {
			System.out.println(i.getText());
		}
		
		
	}
}
