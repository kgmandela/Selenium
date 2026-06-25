package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//maximize window
		driver.manage().window().maximize();
		
//		//static wait
//		Thread.sleep(5000);
//		
//		//dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//sel 4 new
		
		
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearch.sendKeys("iPhone");
		
		WebElement btnClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnClick.click();
		
	}
	
}
