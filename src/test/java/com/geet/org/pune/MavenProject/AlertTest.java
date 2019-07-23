package com.geet.org.pune.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertTest {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement gobnt=driver.findElement(By.xpath("//input[@value='Go!']"));
	  gobnt.click();
	  
	  Alert myalt=driver.switchTo().alert();
	
	  System.out.println(myalt.getText());
	  myalt.accept();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	   driver= new ChromeDriver();
	  
	 driver.get("http://output.jsbin.com/usidix/1");
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
