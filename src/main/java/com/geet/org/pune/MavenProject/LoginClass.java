package com.geet.org.pune.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass {
	WebDriver driver;
	
	

	

	public LoginClass(WebDriver driver2) {
		driver=driver2;
	}





	public void loginfunction() {
		WebElement Username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		Username.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin123");

		WebElement loginbnt = driver.findElement(By.xpath("//input[@name='Submit']"));
		loginbnt.click();
		
	}

}
