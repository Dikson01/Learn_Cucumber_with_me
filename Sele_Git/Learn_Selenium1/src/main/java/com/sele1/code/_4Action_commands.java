package com.sele1.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _4Action_commands {
	WebDriver driver;
	
	public void init(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Command() {
		driver.get("https://vinothqaacademy.com/mouse-event");
		
		//Drag and Drop
		WebElement drag = driver.findElement(By.xpath("//div[@id = 'draggableElement']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id = 'droppableElement']"));
		System.out.println(drag.isEnabled());
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		//Double click
		WebElement dbc = driver.findElement(By.xpath("//button[@id='dblclick']"));
		act.doubleClick(dbc).perform();
		
		//Right click
		WebElement rc = driver.findElement(By.xpath("//button[@id='rightclick']"));
		act.contextClick(rc).perform();
		
		//mouse hover
		act.moveToElement(dbc);
		
		
	}
}







