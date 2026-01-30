package com.sele1.code;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _3Select_command {
	WebDriver driver;
	
	public void init(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Browese() {
		//Wait
		driver.get("https://practice.expandtesting.com/dropdown");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		WebElement All = driver.findElement(By.xpath("//select[@name = 'country']"));
		Select select = new Select(All);
		select.selectByVisibleText("India");
		
		//Alert
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'btn btn-danger']")));
		button.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		//iframe(single)
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		WebElement frm0 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frm0);
		driver.findElement(By.xpath("//input")).sendKeys("Yo");
		driver.switchTo().defaultContent();
		//iframe(nested)
		driver.findElement(By.xpath("//a[contains(text(),'with')]")).click();
		WebElement frm1 = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
		driver.switchTo().frame(frm1);
		WebElement frm2 = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
		System.out.println(frm2.isDisplayed());
		driver.switchTo().frame(frm2);
		driver.findElement(By.xpath("//input")).sendKeys("Yo");
		
		//files(upload)
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		WebElement upload = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input")));
		upload.sendKeys("D:/Document/0.jpg");
		
		driver.quit();
	}
	
	
}




















