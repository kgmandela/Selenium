package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) {
		
		//1.isdisplayed
		//2.isenabled
		//3.isselected
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/#google_v");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		boolean displayed = txtUser.isDisplayed();
		System.out.println(displayed);
		
		WebElement btnFile = driver.findElement(By.xpath("//input[@name=\"filename\"]"));
		boolean enabled = btnFile.isEnabled();
		System.out.println(enabled);
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@value=\"cbselenium\"]"));
		System.out.println("Before select....."+checkBox.isSelected());
		checkBox.click();
		System.out.println("After select....."+checkBox.isSelected());
		
		
	}
	
}
