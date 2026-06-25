package org.pratctice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_prac {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/webhp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement txtSearch = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
		txtSearch.sendKeys("Vel Murugan");
		
		Actions a = new Actions(driver);
		
		//double click
		a.doubleClick(txtSearch).click().perform();
		
		//right click
		a.contextClick(txtSearch).perform();
		
		Robot r = new Robot();
		//down
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
	}
}
