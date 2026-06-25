package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_class {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		//Xpath
//		WebElement txtUsername = driver.findElement(By.xpath("//input[@type='text']"));
//		txtUsername.sendKeys("Gokul");
//		
//		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
//		txtPassword.sendKeys("12345");
		
//		//Xpath using index
//		WebElement txtUser = driver.findElement(By.xpath("(//input[@class='login_input'])[1]"));
//		txtUser.sendKeys("Welcome");
//		
//		WebElement txtPass = driver.findElement(By.xpath("(//input[@class='login_input'])[2]"));
//		txtPass.sendKeys("12345");
//		
//		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
//		btnLogin.click();
		

//		List<WebElement> li = driver.findElements(By.className("login_input"));
//		// 0 1
//		WebElement txtUser = li.get(0);
//		txtUser.sendKeys("Gokul");
//		
//		WebElement txtPassword = li.get(1);
//		txtPassword.sendKeys("123");
		
		List<WebElement> l2 = driver.findElements(By.xpath("//input[@class='login_input']"));
		//0 1
		WebElement txtUser1 = l2.get(0);
		txtUser1.sendKeys("Rahul");
		
		WebElement txtPass = l2.get(1);
		txtPass.sendKeys("123");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnLogin.click();
	}
}
	