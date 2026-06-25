package org.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//simple Alert
		WebElement btnSimple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		btnSimple.click();
		
		//switch to Alert
		Alert sa = driver.switchTo().alert();
		
		//get the text from Alert
		String text = sa.getText();
		System.out.println(text);
		sa.accept();
		
		Thread.sleep(3000);
		
		//confirm Alert
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		
		WebElement btnConfirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		btnConfirm.click();
		
		Alert ca = driver.switchTo().alert();
		String text2 = ca.getText();
		System.out.println(text);
		ca.dismiss();
		
		Thread.sleep(3000);
		
		//prompt
		WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt.click();
	
		
		WebElement btnprompt = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		btnprompt.click();
		
		Alert pa = driver.switchTo().alert();
		String text3 = pa.getText();
		System.out.println(text3);
		pa.sendKeys("Gokul");
		pa.accept();
		
	}
}
