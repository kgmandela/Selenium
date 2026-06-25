package org.pratctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss_prac_QUESTION5 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		
		Actions a = new Actions(driver);
		
		//move to element
		a.moveToElement(Sports).perform();
		
		WebElement Weight = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		a.click(Weight).perform();
				
	}
}
