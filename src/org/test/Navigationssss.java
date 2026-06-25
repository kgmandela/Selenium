package org.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationssss {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		
		Navigation n = driver.navigate();
		n.to("https://www.facebook.com/");
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		//back
		driver.navigate().back();
		Thread.sleep(5000);
		
		//forward
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//refresh
		driver.navigate().refresh();
	
		
		
}
}