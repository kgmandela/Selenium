package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//first table
		WebElement table1 = driver.findElement(By.id("customers"));
		
		//get all text from table
//		System.out.println("=======get all text from table=======");
//		String text = table1.getText();
//		System.out.println(text);
		
//		get all text in row wise
		List<WebElement> tableRow = table1.findElements(By.tagName("tr"));
		
//		System.out.println("=======get all text in row wise=======");
//		for(int i=0; i<tableRow.size();i++) {
//			WebElement w = tableRow.get(i);
//			String text2 = w.getText();
//			System.out.println(text2);
//	}
//		//get heading only
//		System.out.println("=====get heading only======");	
//		for(int i=0;i<tableRow.size();i++) {
//			WebElement row = tableRow.get(i);
//			List<WebElement> head = row.findElements(By.tagName("th"));
//			for(int j=0; j<head.size();j++) {
//				WebElement we = head.get(j);
//				String text3 = we.getText();
//				System.out.println(text3);
//	}
//}
//		
				
//		//get data only
//		System.out.println("=======get data only========");
//		for(int i=0; i<tableRow.size();i++) {
//			WebElement row = tableRow.get(i);
//			List<WebElement> data = row.findElements(By.tagName("td"));
//			for (int j=0; j<data.size();j++ ) {
//				WebElement d = data.get(j);
//				String text4 = d.getText();
//				System.out.println(text4);
//			
//			
//			
//}			
//}	
//		//get particular data only
//		System.out.println("======get particular data only=======");
//		for(int i=0; i<tableRow.size();i++) {
//			WebElement row = tableRow.get(i);
//			List<WebElement> data = row.findElements(By.tagName("td"));
//			for(int j=0; j<data.size();j++) {
//				WebElement d = data.get(j);
//				String text = d.getText();
//				if(text.equals("UK")) {
//					System.out.println(text);
//					//entire row
//					System.out.println(row.getText());
//				}
//			}
//			
//			
//		}
		
		//get last row
		WebElement last = tableRow.get(tableRow.size()-1);
		String text = last.getText();
		System.out.println(text);
		
		
		}
		}
	