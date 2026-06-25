package org.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.multipart.FileUpload;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//type conversion
		int a=10;
		long b=20;
		b=a;
		
		//type casting
		int c=10;
		long d=20;
		c=(int)d;
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trainingintambaram.net/selenium-training-in-chennai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File srcFile = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(srcFile);
		
		WebElement txtTitle = driver.findElement(By.xpath("//div[@class='page-title']"));
		File srcFile2 = txtTitle.getScreenshotAs(OutputType.FILE);
		
		//copy
		File destFile = new File ("C:\\Users\\Gokul\\eclipse-workspace\\Selenium_10 AM_Mar2026\\Screenshot//greentech_1.png");
		
		FileUtils.copyFile(srcFile2, destFile);
		System.out.println("Done");
	}
	
}
