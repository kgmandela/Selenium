package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//div[@title='Courses']"));
		
		Actions a = new Actions(driver);
		
		//move to element
		a.moveToElement(courses).perform();
		
		WebElement Oracle = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(Oracle).perform();
		
		WebElement sql = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
		a.click(sql).perform();
		
		
		//another way
		a.moveToElement(courses).moveToElement(Oracle).click(sql).perform();
		
	}
	
	
}
