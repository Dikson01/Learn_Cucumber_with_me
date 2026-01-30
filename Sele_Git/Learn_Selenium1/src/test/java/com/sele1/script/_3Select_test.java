package com.sele1.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.sele1.code._3Select_command;

public class _3Select_test {
	
	WebDriver driver = new EdgeDriver();
	_3Select_command sc = new _3Select_command();
	
  @Test
  public void Test() {
	  sc.init(driver);
	  sc.Browese();
  }
}
