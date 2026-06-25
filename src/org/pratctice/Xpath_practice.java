package org.pratctice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_practice
{
//	QUESTION 1 - facebook login button using xpath
//	----------
	//https://www.facebook.com/ 
public static void main(String[] args) {
	
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.facebook.com/");
//	
//	WebElement txtemail = driver.findElement(By.xpath("//input[@type='text']"));
//	txtemail.sendKeys("gokul@gmail.com");
//	
//	WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
//	txtPassword.sendKeys("12345");
//	
//	WebElement btnLogin = driver.findElement(By.xpath("(//div[@role='none'])[2]"));
//	btnLogin.click();
	
	
//	QUESTION 2
//	----------
//	URL : https://www.redbus.in/ 
//
//	NOTE: Enter from and to textbox.
	
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.redbus.in/");
//	
//	WebElement txtFrom = driver.findElement(By.xpath("(//input[@class='inputField___38c8c3'])[1]"));
//	txtFrom.sendKeys("Chennai");
//	
//	WebElement txtTo = driver.findElement(By.xpath("(//input[@class='inputField___38c8c3'])[2]"));
//	txtTo.sendKeys("Madurai");
	
//	Day -3 exercise
//	QUESTION 1
//	-----------
//	URL : https://www.amazon.in/
//
//	NOTE: Click start here. Enter iphone and search
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement txtSearch = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]"));
	txtSearch.sendKeys("iphone");
	
	WebElement txtfind = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
	txtfind.click();
	driver.quit();
	
//	QUESTION 2
//	-----------
//	URL : https://www.facebook.com/
//
//	NOTE: Enter email and password and click login(by using xpath locator).
	
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.facebook.com/");
//	
//	WebElement txtEmail = driver.findElement(By.xpath("(//input[@dir='ltr'])[1]"));
//	txtEmail.sendKeys("gokul@gmail.com");
//	
//	WebElement txtPass = driver.findElement(By.xpath("(//input[@dir='ltr'])[2]"));
//	txtPass.sendKeys("123");
//	
//	WebElement btnLogin = driver.findElement(By.xpath("(//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft'])[1]"));
//	btnLogin.click();
	
	
//	QUESTION 3
//	-----------
//	URL : http://demo.automationtesting.in/Register.html
//
//	NOTE: Give details and register the form.
	
}
	
}
