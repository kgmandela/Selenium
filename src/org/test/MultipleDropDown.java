package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Multi = driver.findElement(By.name("multipleselect[]"));
		
		Select s = new Select(Multi);
		
		//multiple or not
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		Thread.sleep(3000);
		
		//index
		s.selectByIndex(3);
		
		//text
		s.selectByVisibleText("Agile Methodology");
		
		//value
		s.selectByValue("msmanual");
		
		//get all options
		List<WebElement> p = s.getOptions();
		for(WebElement e : p) {
			String text = e.getText();
			System.out.println(text);
			
		//get selected options
		System.out.println("======Selected options only======");
		List<WebElement> allSelect = s.getAllSelectedOptions();
		for(WebElement f : allSelect) {
			String text2 = f.getText();
			System.out.println(text2);
//				
//		//get first selected option
//			System.out.println("======First Selected option======");
//			WebElement firstSelectedOption = s.getFirstSelectedOption();
//			String text3 = firstSelectedOption.getText();
//			System.out.println(text3);
			
				
				
			
		//deselect using index
			s.deselectByIndex(2);
			
		//using value
			s.deselectByValue("msselenium");
			
		//using text
			s.deselectByVisibleText("Manual Testing");
			
		//deselect all
			s.deselectAll();
			
		//select all using index
			for(int i=0; i<p.size();i++) {
				s.selectByIndex(1);
			}
			
		//select all by using value
			for(int i=0; i<p.size(); i++) {
				WebElement w = p.get(i);
				String attribute = w.getAttribute("value");
				s.selectByValue(attribute);
			}	
			
		//select all by using text	
			for(int i=0; i<p.size(); i++) {
				WebElement w = p.get(i);
				String text3 = w.getText();
				s.selectByVisibleText(text3);
			}
			}
		}
	}
}
