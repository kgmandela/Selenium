package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions2 {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement txtUser = driver.findElement(By.name("email"));
		txtUser.sendKeys("Gokul Mandela");
		
		Actions a = new Actions(driver);
		
		//double click
		a.doubleClick(txtUser).click().perform();
		
		
		Robot r = new Robot();
		
		//copy
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
				
		WebElement txtPass = driver.findElement(By.name("pass"));
		a.click(txtPass).perform();
		
		//paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		WebElement btnLogin = driver.findElement(By.xpath("(//div[@class='x3nfvp2 x1n2onr6 xh8yej3'])[1]"));
		btnLogin.click();
		
		driver.quit();
}
}
