package org.pratctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss_prac {

//	//QUESTION 2
//	-----------
//	URL:  http://www.amazon.in
//
//	NOTE: Try Prime first mouseover
//	      Click Free fast delievery on prime items

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		Actions a = new Actions(driver);
		
		//move to element
		a.moveToElement(Prime).perform();
		
		
		
	}	
	
}
