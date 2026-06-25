package org.pratctice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryQ6Day9 {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select s = new Select(country);
		
		//get all options
		List<WebElement> c = s.getOptions();
		for(WebElement e : c) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
		
	}
	
	
}
