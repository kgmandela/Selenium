package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drop = driver.findElement(By.name("dropdown"));
		
		Select s = new Select(drop);
		
		//index
		s.selectByIndex(2);
		
		//value
		s.selectByValue("ddselenium");
		
		//text
		s.selectByVisibleText("Automation Testing");
		
		//is multiple
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		//get all options
		List<WebElement> options = s.getOptions();
		
		//for loop
		
		for(int i=0;i<options.size();i++) {
			WebElement w = options.get(i);
			String text = w.getText();
			System.out.println(text);
		}
		
		//Enhanced for loop
		for(WebElement x : options) {
		String text = x.getText();
		System.out.println(text);
	}
	}
}
