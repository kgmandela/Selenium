package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss_DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement srcBank = driver.findElement(By.id("credit2"));
		WebElement destBank = driver.findElement(By.id("bank"));
		
		Actions a = new Actions(driver);
		
		//drag and drop
		a.dragAndDrop(srcBank, destBank).perform();
		
		WebElement srcAccount = driver.findElement(By.id("fourth"));
		WebElement destAmount = driver.findElement(By.id("amt7"));
		
		a.dragAndDrop(srcAccount, destAmount).perform();
		
		//another way
//		a.clickAndHold(srcAccount).moveToElement(destAmount).release().perform();
		
		
	}
}
