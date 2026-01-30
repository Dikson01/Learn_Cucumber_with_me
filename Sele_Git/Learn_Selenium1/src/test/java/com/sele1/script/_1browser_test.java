package com.sele1.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.sele1.code._1browser_command;
import org.testng.*;

public class _1browser_test {
	
	WebDriver driver = new EdgeDriver();
	_1browser_command bc = new _1browser_command();
	String Exp_val = "Google";
	
  @Test
  public void browserCommand() {
	  bc.init(driver);
	  bc.invoke();
	  String Act_val = bc.Ass();
	  
	  Assert.assertEquals(Exp_val, Act_val, "The");
	  
	  bc.navigate();
  }
}
