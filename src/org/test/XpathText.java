package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		//xpath using text
		WebElement title2 = driver.findElement(By.xpath("//td[text()='Existing User Login - Build 1']"));
		String text2 = title2.getText();
		System.out.println(text2);
		
		//xpath using text contains
		WebElement newUser = driver.findElement(By.xpath("//a[contains(text(),'New')]"));
		String text3 = newUser.getText();
		System.out.println(text3);
		newUser.click();
						
		//xpath using attribute
		WebElement title = driver.findElement(By.xpath("//td[@class='login_title']"));
		String text = title.getText();
		System.out.println(text);
		
		//xpath using attribute contains
		WebElement txtUsername = driver.findElement(By.xpath("//input[contains(@name, 'user')]"));
		txtUsername.sendKeys("Gokul");
		String attribute = txtUsername.getAttribute("value");
		System.out.println(attribute);
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
		txtPassword.sendKeys("123");
		String attribute2 = txtPassword.getAttribute("value");
		System.out.println(attribute2);
		
		
	}	
}
