package com.sele1.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.sele1.code.Locator_commands;

public class Locator_Test {
	WebDriver driver = new EdgeDriver();
	Locator_commands lc = new Locator_commands();
	
  @Test
  public void test1() throws InterruptedException {
	  
	  lc.init(driver);
	  lc.Locators();
	  
  }
}
