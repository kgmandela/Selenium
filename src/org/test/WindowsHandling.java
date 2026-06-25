package org.test;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement btnClose = driver.findElement(By.xpath("//span[@role='button']"));
		btnClose.click();
		
		WebElement txtSearch = driver.findElement(By.xpath("(//input[@name='q'])[1]"));
		txtSearch.sendKeys("vivo Y19e (Titanium Silver, 64 GB) (4 GB RAM)",Keys.ENTER);
		
		WebElement vivo = driver.findElement(By.xpath("(//div[@class='RG5Slk'])[1]"));
		vivo.click();
		
		//we need to switch into another window
		
		//get current window id
		String parentId = driver.getWindowHandle();
		System.out.println(parentId); //10
		
		//get all window id
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);  //10, 20
		
		List<String> li = new ArrayList<>();
		li.addAll(allId); // 0 1
		
		driver.switchTo().window(li.get(1));	
		WebElement mblText = driver.findElement(By.xpath("//h1[text()='vivo Y19e (Titanium Silver, 64 GB) (4 GB RAM)']"));
		String text = mblText.getText();
		System.out.println(text);
		
		Thread.sleep(5000);
		
		driver.close(); // it will close current window
		
		Thread.sleep(5000);
		
		driver.quit(); // it will close entire window
	}
}
