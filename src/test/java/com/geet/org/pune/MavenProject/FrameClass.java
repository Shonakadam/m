package com.geet.org.pune.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FrameClass {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement frame1 = driver.findElement(By.xpath("//frame[@src='overview-frame.html'][@name='packageListFrame']"));
	  driver.switchTo().frame(frame1);
	  driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();
	  
	  driver.switchTo().defaultContent();
	  WebElement frame2 = driver.findElement(By.xpath("//frame[@src='allclasses-frame.html'][@name='packageFrame']"));
	  driver.switchTo().frame(frame2);
	  driver.findElement(By.xpath("//span[@class='interfaceName']")).click();
	  
	  driver.switchTo().defaultContent();
	  WebElement frame3 = driver.findElement(By.xpath("//frame[@src='overview-summary.html'][@name='classFrame']"));
		driver.switchTo().frame(frame3);
	  driver.findElement(By.xpath("//li[@class='navBarCell1Rev']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	   driver= new ChromeDriver();
	  driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
