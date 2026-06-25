package org.pratctice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText_practice {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		//xpath using text
		WebElement txtImp = driver.findElement(By.xpath("//td[text()='Important Note:']"));
		String text = txtImp.getText();
		System.out.println(text);
		
		//xpath using text contains
		WebElement txtImportant = driver.findElement(By.xpath("//td[contains(text(),'Imp')]"));
		String text2 = txtImportant.getText();
		System.out.println(text2);
		
		//xpath using attribute
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='username']"));
		txtUser.sendKeys("Gokul");
		String text3 = txtUser.getAttribute("value");
		System.out.println(text3);
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='login']"));
		btnLogin.click();
		
		
			
		//xpath using attribute contains
		WebElement txtLogin1 = driver.findElement(By.xpath("//input[contains(@name,'log')]"));
		btnLogin.click();
		
	}
}
