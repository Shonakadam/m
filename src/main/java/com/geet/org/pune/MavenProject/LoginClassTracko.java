package com.geet.org.pune.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClassTracko {
	WebDriver driver;
	public LoginClassTracko(WebDriver driver2) {
		driver=driver2;
	}
	public void Loginclassfunction() {
		WebElement emailid=driver.findElement(By.xpath("//input[@id='login-mobile']"));
		emailid.sendKeys("shona@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='login-password']"));
		password.sendKeys("shona123");
		
		//WebDriverWait wait= new WebDriverWait(driver, 20);       //explicity wait
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='sub_btn']")));
		
		WebElement loginbnt=driver.findElement(By.xpath("//button[@id='sub_btn']"));
		loginbnt.click();
		
	}

}
