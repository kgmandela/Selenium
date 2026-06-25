package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://adactinhotelapp.com/");
		
//		//id
//		WebElement txtUsername = driver.findElement(By.id("username"));
//		txtUsername.sendKeys("Gokul");
//		
//		WebElement txtPassword = driver.findElement(By.id("password"));
//		txtPassword.sendKeys("12345");
//		
//		
//		//name
//		WebElement txtUsername1 = driver.findElement(By.name("username"));
//		txtUsername1.sendKeys("Ragul");
//		
//		WebElement txtPassword1 = driver.findElement(By.name("password"));
//		txtPassword1.sendKeys("98765");
//		
//	    WebElement btnLogin = driver.findElement(By.name("login"));
//	    btnLogin.click();
		
		//QUESTIONS(Practical)
//		--------------------
//		QUESTION 1
//		----------
//		URL : https://www.facebook.com/ 
//
//		NOTE: Enter Email or Phone and Password.
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		
//		WebElement txtEmail = driver.findElement(By.name("email"));
//		txtEmail.sendKeys("gokul@gmail.com");
//		
//		WebElement txtPass = driver.findElement(By.name("pass"));
//		txtPass.sendKeys("12345");
//		
//		WebElement btnLogin = driver.findElement(By.name("Log in"));
//		btnLogin.click();
		

//		QUESTION 4
//		----------
//		URL : https://infinity.icicibank.com/corp/Login.jsp
//
//		NOTE: Enter username and password. 

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
//		
//		WebElement txtUserID = driver.findElement(By.id("user-id"));
//		txtUserID.sendKeys("123456");
//		
//		WebElement txtPassword = driver.findElement(By.id("password"));
//		txtPassword.sendKeys("98765");
//		
////		QUESTION 6
//		----------
//		URL : https://www.swiggy.com/
//
//		NOTE: Enter the location.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		WebElement txtLocation = driver.findElement(By.name("location"));
		txtLocation.sendKeys("Chrompet");
		
	}
}


