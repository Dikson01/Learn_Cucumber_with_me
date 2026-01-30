package com.sele1.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.sele1.code._4Action_commands;

public class _4Action_test {
	
	WebDriver driver = new EdgeDriver();
	_4Action_commands ac = new _4Action_commands();
	
  @Test
  public void testing() {
	  ac.init(driver);
	  ac.Command();
  }
}
